import java.util.Scanner;

public class Homework1_Task10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int liters,buckets;
		liters=sc.nextInt();
		buckets=liters/5;
		switch (liters%5) {
		case 1:
			System.out.format("%d buckets of 2 liters and\n%d buckets of 3 liters",buckets-1,buckets+1);
			break;
		case 2:
			System.out.format("%d buckets of 2 liters and\n%d buckets of 3 liters",buckets+1,buckets);
			break;
		case 3:
			System.out.format("%d buckets of 2 liters and\n%d buckets of 3 liters",buckets,buckets+1);
			break;
		case 4:
			System.out.format("%d buckets of 2 liters and\n%d buckets of 3 liters",buckets+2,buckets);
			break;
		default:
			break;
		}
		sc.close();

	}

}
