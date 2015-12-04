import java.util.Scanner;

public class Homework1_Task11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,numCpy;
		while(true){
			boolean flag=false;
			num=sc.nextInt();
			numCpy=num;
			while(numCpy!=0){
				if(numCpy%10==0) flag=true;
				numCpy/=10;
			}
			if(flag==false) break;
			System.out.println("Invalid input.Insert number with no zeroes.");
		}
		
		numCpy=num;
		boolean flag=true;
		while(numCpy!=0)
		{
			if(num%(numCpy%10)!=0){
				flag=false;
				break;
			}
			numCpy/=10;
		}
		System.out.println(flag);
		sc.close();

	}

}
