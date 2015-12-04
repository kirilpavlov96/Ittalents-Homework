import java.util.Scanner;

public class Homework1_Task7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		double myMoney=sc.nextDouble();
		boolean amIHealthy=sc.nextBoolean();
		if(!amIHealthy) {
			System.out.println("I wont go out.");
			if(myMoney>0) System.out.println("I will buy drugs.");
			else System.out.println("I will stay home and drink tea.");
		}
		else {
			if(myMoney<10) System.out.println("I will go to a cafe.");
			else System.out.println("I will go to the movies.");
		}
//		 - ако съм болен, няма да излизам
//		 - ако имам пари, ще си купя лекарства
//		 - ако нямам – ще стоя вкъщи и ще пия чай
//		 - ако съм здрав, ще отида на кино с приятели
//		 - ако имам по-малко от 10 лв, ще отида на кафе
	}
}
