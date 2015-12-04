import java.util.Scanner;

public class Homework1_Task5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1<=num2 && num1<=num3)
			System.out.format("%d %d %d", num1,Math.min(num2,num3),Math.max(num2, num3));
		if(num2<=num1 && num2<=num3)
			System.out.format("%d %d %d", num2,Math.min(num1,num3),Math.max(num1, num3));
		if(num3<=num2 && num3<=num1)
			System.out.format("%d %d %d", num3,Math.min(num2,num1),Math.max(num2, num1));

	}
}
