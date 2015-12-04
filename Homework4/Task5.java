import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cows=4,rows=4,maxSumRows=Integer.MIN_VALUE,maxSumCows=Integer.MIN_VALUE;
		int[][] arr2d=new int[cows][rows];
		for(int i=0;i<cows;i++){
			int sumCows=0;
			for(int j=0;j<rows;j++){
				arr2d[i][j]=sc.nextInt();
				sumCows+=arr2d[i][j];
			}
			if(sumCows>maxSumCows) maxSumCows=sumCows;
		}
		for(int i=0;i<cows;i++){
			int sumRows=0;
			for(int j=0;j<rows;j++){
				sumRows+=arr2d[j][i];
			}
			if(sumRows>maxSumRows) maxSumRows=sumRows;
		}
		System.out.println("The max sum of the elements in a cow is:" + maxSumCows);
		System.out.println("The max sum of the elements in a row is:" + maxSumRows);
		System.out.print("The max cow sum is ");
		if(maxSumCows>maxSumRows) System.out.print(">");
		else if(maxSumCows<maxSumRows) System.out.print("<");
		else if(maxSumCows==maxSumRows) System.out.print("=");
		System.out.println(" than max row sum.");

	}

}
