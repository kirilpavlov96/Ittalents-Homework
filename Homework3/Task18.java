import java.util.Arrays;
import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		int[] arr3=new int[size];
		for(int i=0;i<size;i++)
			arr1[i]=sc.nextInt();
		for(int i=0;i<size;i++)
			arr2[i]=sc.nextInt();
		for(int i=0;i<size;i++)
			arr3[i]=Math.max(arr1[i], arr2[i]);
		System.out.println(Arrays.toString(arr3));
	}

}
