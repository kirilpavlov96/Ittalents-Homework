import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = Math.max(n, m); i >= Math.min(n, m); i--) {
			if (i % 50 == 0) {
				if (i != Math.max(n, m))
					System.out.print(",");
				System.out.print(i);
			}
		}
	}

}
