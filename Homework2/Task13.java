import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		for(int i=100;i<=999;i++)
		{
			int cpy=i;
			int dig1=cpy%10;
			cpy/=10;
			int dig2=cpy%10;
			cpy/=10;
			int dig3=cpy%10;
			if(dig1+dig2+dig3==sum) System.out.println(i);
		}

	}

}
