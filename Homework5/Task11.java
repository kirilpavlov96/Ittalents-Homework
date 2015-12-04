
public class Task11 {

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i] + ", ");
			} else {
				if (i == array.length - 1) {
					System.out.print(array[i] + "]");
				} else {
					System.out.print(array[i] + ", ");
				}
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		printArray(new int[] { 1, 2, 3, 4, 1,-1,12 });
	}

}
