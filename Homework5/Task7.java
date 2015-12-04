import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the words on one line, separated by ivterval.");
		String words=sc.nextLine();
		String[] arrOfWords=words.split(" ");
		int maxSize=Integer.MIN_VALUE;
		for(int i=0;i<arrOfWords.length;i++){
			if(arrOfWords[i].length()>maxSize){
				maxSize=arrOfWords[i].length();
			}
		}
		System.out.printf("%d words,the longest's size is %d.",arrOfWords.length,maxSize);

	}

}
