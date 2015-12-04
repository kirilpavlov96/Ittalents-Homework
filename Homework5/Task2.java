import java.util.Scanner;

public class Task2 {

	static boolean inBounds(String str){
		if(str.length()<=20 && str.length()>=10){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next(),str2=sc.next();
		if((!inBounds(str1))||(!inBounds(str2))){
			System.out.println("Incorrect input.");
			return;
		}
		String cpyStr1=new String(str1);
		str1=str2.substring(0, 5)+str1.substring(5, str1.length());
		str2=cpyStr1.substring(0,5)+str2.substring(5, str2.length());
		if(str1.length()>str2.length()){
			System.out.println(str1.length()+" "+str1);
		}
		else{
			System.out.println(str2.length()+" "+str2);
		}
	}
}
/*
aaaaaaaaaaaaa bbbbbbbbbbb
*/
