import java.util.Arrays;
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] array=new double[10];
		double[] newArray=new double[10];
		double sum=0;
		int size=10;
		for(int i=0;i<10;i++){
			array[i]=sc.nextDouble();
			if(array[i]<0.231) newArray[i]=i*i+41.25;
			else newArray[i]=array[i]*i;
			sum+=newArray[i];
			if(newArray[i]==0) size--;
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(newArray));
		System.out.println(sum/size);
		
	}

}
// -1.12 -2.43 3.1 4.2 0 6.4 -7.5 8.6 9.1 -4