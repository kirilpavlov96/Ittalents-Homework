import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next(),str2=sc.next();
		int indexInStr1=0,indexInStr2=0;
		boolean breakflag=false;
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
					indexInStr1=i;
					indexInStr2=j;
					breakflag=true;
					break;
				}
			}
			if(breakflag) break;
		}
		
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				if(j==indexInStr2){
					System.out.print(str1.charAt(i));
				}
				else{
					if(i==indexInStr1){
						System.out.print(str2.charAt(j));
					}
					else{
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}

}
