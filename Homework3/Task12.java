import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[7];
		for(int i=0;i<7;i++){
			array[i]=sc.nextInt();
		}
		//0 1
		int cpy=array[0];
		array[0]=array[1];
		array[1]=cpy;
		//2 3
		array[2]+=array[3];
		array[3]=array[2]-array[3];
		array[2]-=array[3];
		//4 5
		array[4]*=array[5];
		array[5]=array[4]/array[5];
		array[4]/=array[5];
		
		System.out.println(Arrays.toString(array));
	}

}
