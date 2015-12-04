import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int second=sc.nextInt();
		for(int i=Math.min(first, second);i<=Math.max(first, second);i++)
			System.out.println(i);
	}

}
