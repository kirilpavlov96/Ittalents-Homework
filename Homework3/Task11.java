import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[7];
		for(int i=0;i<7;i++){
			array[i]=sc.nextInt();
			if(array[i]%5==0 && array[i]>5) System.out.print(array[i]+" ");
		}

	}

}
