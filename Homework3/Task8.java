import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		int[] array=new int[arraySize+1];
		for(int i=0;i<array.length-1;i++){
			array[i]=sc.nextInt();
		}
		array[arraySize]=array[arraySize-1]+1;
		int prevEl=0;
		int max=Integer.MIN_VALUE;
		int counter=1;
		for(int i=1;i<array.length;i++){
			if(array[i]==prevEl){
				counter++;
			}
			else{
				if(counter>max) max=counter;
				counter=1;
			}
			prevEl=array[i];
		}
		System.out.println(max);
	}

}
