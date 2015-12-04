import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cows=6,rows=6;
		int[][] arr2d=new int[cows][rows];
		for(int i=0;i<cows;i++){
			for(int j=0;j<rows;j++){
				arr2d[i][j]=sc.nextInt();
			}
		}
		
		int sumOfSums=0;
		for(int i=1;i<cows;i+=2){
			int sum=0;
			for(int j=0;j<rows;j++){
				if(j==rows-1) System.out.print(arr2d[i][j]+ " ");
				else System.out.print(arr2d[i][j]+", ");
				sum+=arr2d[i][j];
			}
			System.out.println("sum="+sum);
			sumOfSums+=sum;
		}
		System.out.println("Sum of the elements:"+sumOfSums);
	}

}
