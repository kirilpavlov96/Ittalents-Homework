import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int counter=1;
		int current=num+1;
		while(counter<=10){
			if(current%2==0 || current%3==0 || current%5==0) {
				if(counter==10)
					System.out.format("%d:%d",counter,current);
				else 
					System.out.format("%d:%d, ",counter,current);
				counter++;
			}
			current++;
		}
	}

}
