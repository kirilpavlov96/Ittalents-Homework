import java.util.Scanner;

public class Task7 {

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
		for(int i=0;i<cows;i++){
			int sum=0;
			for(int j=0;j<rows;j++){
				if(j==rows-1) System.out.print(arr2d[i][j]+ " ");
				else System.out.print(arr2d[i][j]+", ");
				if((i+j)%2==0) sum+=arr2d[i][j];
			}
			System.out.println("sum="+sum);
			sumOfSums+=sum;
		}
		System.out.println("Sum of the elements:"+sumOfSums);

	}

}
/*
11 12 13 14 15 16
21 22 23 24 25 26 
31 32 33 34 35 36 
41 42 43 44 45 46 
51 52 53 54 55 56 
61 62 63 64 65 66
Изход:
11, ,13, ,15, , сума от елементите за реда: 39
22, ,24, ,26, сума от елементите за реда: 72
31, ,33, ,35, , сума от елементите за реда: 99
42, ,44, ,46, сума от елементите за реда: 132
51, ,53, ,55, , сума от елементите за реда: 159
62, ,64, ,66 сума от елементите за реда: 192
Сума на елементите: 693

*/