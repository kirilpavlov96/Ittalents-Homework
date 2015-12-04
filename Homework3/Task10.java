import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[7];
		int sum=0;
		for(int i=0;i<7;i++){
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		double avarage=sum/7;
		int index=-1;
		double min=Integer.MAX_VALUE;
		for(int i=0;i<7;i++){
			if(Math.abs(avarage-array[i])<min){
				min=Math.abs(avarage-array[i]);
				index=i;
			}
		}
		System.out.println(array[index]);

	}

}
