import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cows=6,rows=5,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		int[][] arr2d=new int[cows][rows];
		for(int i=0;i<cows;i++)
			for(int j=0;j<rows;j++){
				arr2d[i][j]=sc.nextInt();
				if(arr2d[i][j]<min) min=arr2d[i][j];
				if(arr2d[i][j]>max) max=arr2d[i][j];
			}
		System.out.println("The max element is:" + max);
		System.out.println("The min element is:" + min);
	}

}
