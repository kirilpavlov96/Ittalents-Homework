import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cows=sc.nextInt();
		int[][] arr2d=new int[cows][cows];
		for(int i=0;i<cows;i++)
			for(int j=0;j<cows;j++)
				arr2d[i][j]=sc.nextInt();
		System.out.println("The main diagonal:");
		for(int i=0;i<cows;i++){
			for(int j=0;j<cows;j++){
				if(i==j) System.out.print(arr2d[i][j] + " ");
				else System.out.print("  ");
			}
			System.out.println("");
		}
		System.out.println("The secondary diagonal:");
		for(int i=0;i<cows;i++){
			for(int j=0;j<cows;j++){
				if(j==cows-i-1) System.out.print(arr2d[i][j] + " ");
				else System.out.print("  ");
			}
			System.out.println("");
		}
	}

}
