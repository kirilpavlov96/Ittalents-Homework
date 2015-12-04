import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] array=new int[10];
		array[0]=num;
		array[1]=num;
		for(int i=2;i<=9;i++){
			array[i]=array[i-1]+array[i-2];
		}
		System.out.println(Arrays.toString(array));
	}

}
