import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,i=1;
		do{
			sum+=i;
			i++;
		}while(i<=n);
		System.out.println(sum);
	}

}
