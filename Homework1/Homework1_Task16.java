import java.util.Scanner;

public class Homework1_Task16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		do{
			num=sc.nextInt();
			if(num<100 || num>999) System.out.println("Insert number between 100 and 999.");
			else break;
		} while(true);
		
		int dig3=num%10;
		num/=10;
		int dig2=num%10;
		num/=10;
		int dig1=num%10;
		
		if(dig1>dig2 && dig2>dig3) System.out.println("descending order");
		else if(dig1<dig2 && dig2<dig3) System.out.println("ascending order");
		else if(dig1==dig2 && dig2==dig3) System.out.println("equal");
		else System.out.println("unordered");
		sc.close();
	}
}
