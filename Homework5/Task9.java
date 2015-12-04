import java.util.Scanner;

public class Task9 {

	static boolean isDigit(char ch){
		return (ch =='-'||(ch>='0' && ch<='9'));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		int result=0;
		for(int i=0;i<line.length();i++){
			if(isDigit(line.charAt(i))){
				String num="";
				int j=i;
				while(j<line.length() && isDigit(line.charAt(j))){
					num+=line.charAt(j);
					j++;
				}
				System.out.println(num);
				result+=Integer.parseInt(num);
				i=j;
			}
		}
		System.out.println("The sum is:"+result);
	}

}
