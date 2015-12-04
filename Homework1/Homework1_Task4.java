import java.util.Scanner;

public class Homework1_Task4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1<num2)
		{
			System.out.format("%d %d",num1,num2);
		}
		else{
			if(num1==num2) 
				System.out.println("The numbers are equal.");
			else
				System.out.format("%d %d",num2,num1);
		}
		sc.close();
	}
}
