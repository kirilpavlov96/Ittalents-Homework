import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int curr=n-1;
		for(int i=1;i<=n;i++){
			System.out.println(helpers(curr,n));
			curr+=2;
		}
		sc.close();

	}
	
	public static long helper(int digit,int size) {
		long result=0;
		long par=0;
		if(digit<10) par=10;
		else if(digit<100) par=100;
		else if(digit<1000) par=1000;
		else if(digit<10000) par=10000;
		for(int i=0;i<=size-1;i++)
		{
			result+=(digit*Math.pow(par, i));
		}
		return result;
	}
	
	public static String helpers(int digit,int size){
		String result="";
		for(int i=0;i<=size-1;i++)
		{
			result+=digit;
		}
		return result;
	}

}
