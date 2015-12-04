import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arrsize=sc.nextInt();
		int[] array=new int[arrsize];
		int[] newArray=new int[arrsize*2];
		for(int i=0;i<arrsize;i++){
			array[i]=sc.nextInt();
			newArray[i]=array[i];
		}
		int k=arrsize;
		for(int i=arrsize-1;i>=0;i--,k++){
			newArray[k]=array[i];
		}
		System.out.println(Arrays.toString(newArray));

	}

}
