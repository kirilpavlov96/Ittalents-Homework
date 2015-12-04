import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x=0;
		while(Math.pow(2, x)<=num)
			x++;
		int[] binaryNum=new int[x];
		int index=0;
		while(num!=0){
			binaryNum[index]=num%2;
			index++;
			num/=2;
		}
		for(int i=0;i<binaryNum.length/2;i++){
			int cpy=binaryNum[i];
			binaryNum[i]=binaryNum[binaryNum.length-i-1];
			binaryNum[binaryNum.length-i-1]=cpy;
		}
		System.out.println(Arrays.toString(binaryNum));
	}

}
