import java.util.Scanner;

public class Homework1_Task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3,num4;
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=num1;
		num1=num2;
		num2=num3;
		num3=num4;
		System.out.format("%d %d %d",num1,num2,num3);
		sc.close();

	}

}
