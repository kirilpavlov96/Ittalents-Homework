import java.util.Arrays;

public class Task12 {

	static int[] from1ToNInArray(int n){
		int[] result = new int[n];
		for(int i=0;i<n;i++){
			result[i]=i+1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(from1ToNInArray(5)));
	}

}
