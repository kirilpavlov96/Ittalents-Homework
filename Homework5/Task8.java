import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("PLease insert a word.");
		String line=sc.nextLine();
		boolean flag=true;
		for(int i=0;i<line.length()/2;i++){
			if(line.charAt(i)!=line.charAt(line.length()-i-1)){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("The word is palindrome.");
		}
		else{
			System.out.println("The word isn't palindrome.");
		}
	}

}
