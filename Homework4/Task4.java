import java.util.Scanner;

public class Task4 {

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
		System.out.println("");
		for(int j=0;j<rows;j++){
			for(int i=cows-1;i>=0;i--){
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
