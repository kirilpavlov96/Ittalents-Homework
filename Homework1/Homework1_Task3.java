import java.util.Scanner;

public class Homework1_Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=0,num3=0;
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println(num1);
		System.out.println(num2);
		sc.close();
	}
}
