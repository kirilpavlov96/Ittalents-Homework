import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next(),str2=sc.next();
		if(str1.length()>40 || str2.length()>40){
			System.out.println("Incorrect input.");
			return;
		}
		System.out.print(str1.toUpperCase()+" ");
		System.out.print(str1.toLowerCase()+" ");
		System.out.print(str2.toUpperCase()+" ");
		System.out.print(str2.toLowerCase()+'\n');
	}

}
