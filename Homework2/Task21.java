import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=num-1;i<=51;i++){
			String name=IntToCard(i);
			if(i!=num-1)
				System.out.print(", "+name);
			else System.out.print(name);
		}
		System.out.println("");
	}
	
	public static String IntToCard(int x)
	{
		String[] number={"two","three","four","five","six","seven","eight","nine","ten","Jack","Queen","King","Ace"};
		String[] suit={"clubs", "diamonds", "hearts","spades"};
		String result=number[(int)(x/4)]+" of "+suit[x%4];
		return result;
	}

}
