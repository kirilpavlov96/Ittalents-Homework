import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String s=sc.nextLine();
//		charat
		char c;
		for(int i=1;i<=size;i++){
			if(i==1||i==size) {
				for(int j=1;j<=size;j++){
					System.out.print('*');
				}
			}
			else 
				for(int j=1;j<=size;j++){
					if(j==1 || j==size) System.out.print('*');
					else System.out.print(s.charAt(1));
				}
			System.out.println("");
		}
	}

}
