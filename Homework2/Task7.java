import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n-1;i++){
			System.out.format("%d,",i*3);
		}
		System.out.format("%d\n", n*3);
	}

}
