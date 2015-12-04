import java.util.Scanner;

public class Homework1_Task1 {
	public static void main(String[] args) {
		double firstNum,secondNum,thirdNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert first number:");
		firstNum=sc.nextDouble();
		System.out.println("Insert second number:");
		secondNum=sc.nextDouble();
		System.out.println("Insert third number:");
		thirdNum=sc.nextDouble();
		if(thirdNum>Math.min(firstNum,secondNum) && thirdNum<Math.max(firstNum, secondNum))
			System.out.format("%f is between %f and %f",thirdNum,firstNum,secondNum);
	}
}
