import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		double[] array=new double[size];
		for(int i=0;i<size;i++){
			array[i]=sc.nextDouble();
		}
		double max=Double.MIN_VALUE;
		int index1=0,index2=0,index3=0;
		for(int i=0;i<=size-3;i++){
			for(int i1=i+1;i1<=size-2;i1++){
				for(int i2=i1+1;i2<=size-1;i2++){
					if(Math.abs(array[i]+array[i1]+array[i2])>max){
						max=Math.abs(array[i]+array[i1]+array[i2]);
						index1=i;
						index2=i1;
						index3=i2;
					}
				}
			}
		}
		System.out.println(array[index1]+"; "+array[index2]+"; "+array[index3]);

	}

}
// 6
// 7.13 0.2 4.9 5.1 6.34 1.12 
