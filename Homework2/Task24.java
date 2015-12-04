import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String number=sc.nextLine();
		int size=number.length();
		int ftob=0,btof=size-1;
		boolean isPalindrome=true;
		do{
			if(ftob>(int)(size/2)) break;
			if(number.charAt(ftob)!=number.charAt(btof)){
				isPalindrome=false;
				break;
			}
			else{
				ftob++;
				btof--;
			}
		} while(true);
		if(isPalindrome) System.out.println("The number is palindrome.");
		else System.out.println("The number isn't palindrome.");
		sc.close();
	}

}
//032210004