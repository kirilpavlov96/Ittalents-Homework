import java.util.Arrays;

public class Task13 {

	static int[] arrayConcatenation(int[] arr1,int[] arr2){
		int size=arr1.length+arr2.length;
		int[] result=new int[size];
		for(int i=0;i<size;i++){
			if(i>=0 && i<arr1.length){
				result[i]=arr1[i];
			}
			else{
				result[i]=arr2[i-arr1.length];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrayConcatenation(new int[] {1,2,3} , new int[] {4,5,6})));

	}

}
