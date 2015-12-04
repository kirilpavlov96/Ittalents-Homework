import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean flag=false;
		int sum=0;
		for(int i=a;i<b;i++){
			double poi=(Math.pow(i, 2));
			int powi=(int)poi;
			if(sum>=200) {
				flag=true;
				break;
				}
			if(powi%3==0) System.out.format("skip3,");
			else {
				System.out.format("%d,",powi);
				sum+=powi;
			}
		}
		if(!flag) System.out.format("%d\n",(int)Math.pow(b, 2));
		else System.out.println("");
		sc.close();
	}

}
