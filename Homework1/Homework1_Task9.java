import java.util.Scanner;

public class Homework1_Task9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		boolean isEven;
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=num1*num2;
		if(num3%2==0) isEven=true;
		else isEven=false;
		if(isEven)
			System.out.format("%d,%d - even",num3,num3%10,isEven);
		else 
			System.out.format("%d,%d - odd",num3,num3%10,isEven);
		sc.close();
	}
}
