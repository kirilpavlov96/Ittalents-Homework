import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please insert 2 names divided by comma.");
		String str=sc.nextLine();
		String words[]=str.split(",");
		words[0]=words[0].trim();
		words[1]=words[1].trim();
		int maxSum=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<words.length;i++){
			int sum=0;
			for(int j=0;j<words[i].length();j++){
				sum+=(int)words[i].charAt(j);
			}
			if(sum>maxSum) {
				maxSum=sum;
				index=i;
			}
		}
		System.out.println("The name with the greatest sum of ASCII codes is:");
		System.out.println(words[index]);
	}

}
