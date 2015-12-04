import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cows=sc.nextInt(),rows=sc.nextInt(),sum=0;
		int[][] arr2d=new int[cows][rows];
		for(int i=0;i<cows;i++){
			for(int j=0;j<rows;j++){
				arr2d[i][j]=sc.nextInt();
				sum+=arr2d[i][j];
			}
		}
		System.out.println("The sum of the array's elements is:" + sum);
		System.out.println("The average of the array's elements is:" + (float)(sum/(rows*cows)));
	}

}
