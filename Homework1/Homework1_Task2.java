import java.util.Scanner;

public class Homework1_Task2 {
	public static void main(String[] args) {
		double num1,num2,sum,diff,res1,res2,prod,del1,del2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert first number:");
		num1=sc.nextDouble();
		System.out.println("Insert second number:");
		num2=sc.nextDouble();
		sum=num1+num2;
		diff=Math.abs(num1-num2);
		res1=num1%num2;
		res2=num2%num1;
		prod=num1*num2;
		del1=num1/num2;
		del2=num2/num1;
		System.out.format("num1+num2=%f\n",sum);
		System.out.format("|num1-num2|=%f\n",diff);
		System.out.format("division with remainder=%f\n",res1);
		System.out.format("division with remainder=%f\n",res2);
		System.out.format("num1*num2=%f\n",prod);
		System.out.format("num1/num2=%f\n",del1);
		System.out.format("num2/num2=%f\n",del2);
		sc.close();
	}
}
