import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String words[]=str.split(",");
		words[0]=words[0].trim();
		words[1]=words[1].trim();
		int flag=0;
		if(words[0].length()==words[1].length()){
			System.out.println("The strings have equal lengths.");
			for(int i=0;i<words[0].length();i++){
				if(words[0].charAt(i)!=words[1].charAt(i)){
					if(flag==0){
						System.out.println("Difference in position:");
						flag=1;
					}
					System.out.println(i+" "+words[0].charAt(i)+"-"+words[1].charAt(i));
				}
			}
		}
		else{
			System.out.println("The strings have different lengths.");
		}
	}

}
