import java.util.Scanner;

public class Task10 {

	static String asciiPlus5(String s){
		String newS=new String("");
		for(int i=0;i<s.length();i++){
			newS+=(char)((int)s.charAt(i)+5);
		}
		return newS;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		System.out.println(asciiPlus5(line));
	}

}
