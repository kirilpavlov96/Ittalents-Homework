import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		double[] array=new double[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextDouble();
			if(array[i]>=-2.99 && array[i]<=2.99){
				if(i==size-1) System.out.println(array[i]);
				else System.out.print(array[i]+"; ");
			}
		}
	}

}
//11
//7.1 8.5 0.2 3.7 0.99 1.4 -3.5 -110 212 341 1.2
