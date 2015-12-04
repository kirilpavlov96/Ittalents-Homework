import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the words on one line, separated by ivterval.");
		String words=sc.nextLine();
		String[] arrOfWords=words.split(" ");
		System.out.println("All words with first letter to uppercase:");
		for(int i=0;i<arrOfWords.length;i++){
			if(arrOfWords[i].length()>0){
				System.out.print(Character.toUpperCase(arrOfWords[i].charAt(0)));
				if(arrOfWords[i].length()>1){
					System.out.print(arrOfWords[i].substring(1, arrOfWords[i].length())+" ");
				}
				else{
					System.out.print(" ");
				}
			}
		}
		System.out.println(" ");
	}

}
