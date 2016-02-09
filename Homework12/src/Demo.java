import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TextStatistic ts=new TextStatistic(sc.nextLine());
		ts.printStatistic();
	}
}
