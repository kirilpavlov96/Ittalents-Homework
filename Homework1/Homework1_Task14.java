import java.util.Scanner;

public class Homework1_Task14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos1=sc.nextInt(),pos2=sc.nextInt(),pos3=sc.nextInt(),pos4=sc.nextInt();
		if((pos1+pos2)%2==0 && (pos3+pos4)%2==0) System.out.println("Same colors.");
		else System.out.println("Different colors.");
		sc.close();

	}

}
