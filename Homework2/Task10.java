import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<num;i++){
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) System.out.println("prime number");
		else System.out.println("not a prime number");
		sc.close();
	}
}
