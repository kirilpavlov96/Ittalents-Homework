import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int firstArraySize=sc.nextInt();
		int[] firstArray=new int[firstArraySize];
		for(int i=0;i<firstArray.length;i++){
			firstArray[i]=sc.nextInt();
		}
		int secontArraySize=sc.nextInt();
		int[] secondArray=new int[secontArraySize];
		for(int i=0;i<secondArray.length;i++){
			secondArray[i]=sc.nextInt();
		}
		if(firstArraySize==secontArraySize){
			boolean areEqual=true;
			for(int i=0;i<firstArray.length;i++){
				if(firstArray[i]==secondArray[i]);
				else {
					areEqual=false;
					break;
				}
			}
			if(areEqual) System.out.println("The arrays have the same size and they are not equal.");
			else System.out.println("The arrays have the same size,but they are not equal.");
		}
		else System.out.println("The arrays dont have the same size,so they are not equal.");
	}

}
