import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int stars=1;
		for(int spaces=n-1;spaces>=0;spaces--){
			for(int i=0;i<spaces;i++)
				System.out.print(" ");
			for(int i=0;i<stars;i++)
				System.out.print("*");
			stars+=2;
			System.out.println("");
		}
		
		stars=1;
		for(int spaces=n-1;spaces>=0;spaces--){
			for(int i=0;i<spaces;i++)
				System.out.print(" ");
			for(int i=0;i<stars;i++){
				if(spaces!=n-1&&spaces!=0){
					if((i==0 || i==stars-1))
						System.out.print("*");
					else System.out.print(" ");
				}
				else System.out.print("*");
			}
			stars+=2;
			System.out.println("");
		}
		sc.close();
	}
}
