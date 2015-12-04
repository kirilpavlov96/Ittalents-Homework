import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arrsize=sc.nextInt();
		int min=Integer.MAX_VALUE;
		int[] array=new int[arrsize];
		for(int i=0;i<arrsize;i++){
			array[i]=sc.nextInt();
			if(array[i]<min && array[i]%3==0) {
				min=array[i];
			}
		}
		System.out.println(min);
	}

}
