import java.util.Scanner;

public class Homework1_Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		if (temp < -20)
			System.out.println("super cold");
		else if (temp < 0)
			System.out.println("cold");
		else if (temp < 15)
			System.out.println("cool");
		else if (temp < 25)
			System.out.println("warm");
		else
			System.out.println("hot");
		sc.close();
	}

}
