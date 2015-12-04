import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		int[] array=new int[arraySize];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length/2;i++){
			int cpy=array[i];
			array[i]=array[arraySize-i-1];
			array[arraySize-i-1]=cpy;
		}
		System.out.println(Arrays.toString(array));
	}

}
