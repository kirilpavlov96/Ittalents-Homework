import java.util.Scanner;

public class Homework1_Task8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,dig1,dig2,dig3,dig4,newNum1,newNum2;
		do{
			num=sc.nextInt();
		}
		while(num<1000 && num>9999);
		
		dig4=num%10;num/=10;
		dig3=num%10;num/=10;
		dig2=num%10;num/=10;
		dig1=num%10;
		
		newNum1=dig1*10+dig4;
		newNum2=dig2*10+dig3;
		
		if(newNum1<newNum2) System.out.format("%d is < than %d\n",newNum1,newNum2);
		if(newNum1>newNum2) System.out.format("%d is > than %d\n",newNum1,newNum2);
		if(newNum1==newNum2) System.out.format("%d and %d are equal\n",newNum1,newNum2);
		sc.close();

	}

}
