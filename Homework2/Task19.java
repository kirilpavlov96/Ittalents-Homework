import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=1){
			if((n-1)%2!=0){
				n*=0.5;
				System.out.print(n+" ");
			}
			else {
				n=n*3+1;
				System.out.print(n+" ");
			}
		}
		System.out.println("");

	}
}
