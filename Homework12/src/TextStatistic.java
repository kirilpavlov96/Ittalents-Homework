import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TextStatistic {
	private String text;
	private Map<Character, Integer> statistic;

	private <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k1).compareTo(map.get(k2));
				if (compare == 0)
					return 1;
				else
					return -compare;
			}
		};

		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	public TextStatistic(String text) {
		if (text == null)
			this.text = new String("");
		else
			this.text = new String(text.toLowerCase());
		this.statistic = new TreeMap<Character, Integer>();
		this.makeStatistic();
	}

	private void makeStatistic() {
		for (int i = 0; i < text.length(); i++) {
			if (this.text.charAt(i) <= 'z' && this.text.charAt(i) >= 'a') {
				Integer val = this.statistic.get(this.text.toLowerCase().charAt(i));
				if (val != null) {
					this.statistic.put(this.text.toLowerCase().charAt(i), (val + 1));
				} else {
					this.statistic.put(this.text.toLowerCase().charAt(i), 1);
				}
			}
		}
		this.statistic = sortByValues(this.statistic);

	}

	public void printStatistic() {
		Iterator<Entry<Character, Integer>> it = this.statistic.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry <Character,Integer> mentry = (Map.Entry <Character,Integer>)it.next();
			System.out.print(mentry.getKey().toString().toUpperCase() + ": " + mentry.getValue() + " ");
			for (int i = 0; i < (Integer) mentry.getValue(); i++) {
				System.out.print("#");
			}
			System.out.println("");
		}

	}
}
