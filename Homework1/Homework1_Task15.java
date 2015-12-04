import java.util.Scanner;

public class Homework1_Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double time = sc.nextDouble();
		if ((time >= 18 && time <= 24) || (time >= 1 && time < 4))
			System.out.println("Good evening.");
		else if (time >= 4 && time <= 9)
			System.out.println("Good morning.");
		else if (time > 9 && time < 18)
			System.out.println("Good day");
		else
			System.out.println("Good nothing ;d.");
		sc.close();
	}
}

//Периодите са:[18..4]-
//Добър вечер;[4..9]-
//Добро утро;[9..18]-
//Добър ден