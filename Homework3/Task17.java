import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
		boolean flag=true;
		for(int i=1;i<size;i++){
			if(i%2==0){
				if(array[i]<array[i-1]);
				else{
					flag=false;
					break;
				}
			}
			else{
				if(array[i]>array[i-1]);
				else{
					flag=false;
					break;
				}
			}
		}
		if(flag) System.out.println("The array is zigzag up.");
		else System.out.println("The arrat isn't zigzag up.");
	}

}
