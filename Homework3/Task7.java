import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int firstArraySize=sc.nextInt();
		int[] firstArray=new int[firstArraySize];
		int[] resultArray=new int[firstArraySize];
		for(int i=0;i<firstArray.length;i++){
			firstArray[i]=sc.nextInt();
		}
		resultArray[0]=firstArray[0];
		resultArray[firstArraySize-1]=firstArray[firstArraySize-1];
		for(int i=1;i<firstArray.length-1;i++){
			resultArray[i]=firstArray[i-1]+firstArray[i+1];
		}
		System.out.println(Arrays.toString(resultArray));

	}

}
