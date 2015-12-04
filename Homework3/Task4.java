import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arrsize=sc.nextInt();
		boolean flag=true;
		int[] array=new int[arrsize];
		for(int i=0;i<arrsize;i++){
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<arrsize/2;i++){
			if(array[i]==array[arrsize-i-1]) ;
			else {
				flag=false;
				break;
			}
		}
		if(flag) System.out.println("Масивът е огледален.");
		else  System.out.println("Масивът не е огледален.");

	}

}
