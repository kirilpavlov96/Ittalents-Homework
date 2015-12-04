import java.util.Scanner;

public class Homework1_Task12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date;
		date=sc.nextLine();
		int[] commas=new int[2];
		int[] lpmonths={31,29,31,30,31,30,31,30,31,30,31,30};
		int[] months={31,28,31,30,31,30,31,30,31,30,31,30};
		int index=0;
		for(int i=0;i<date.length();i++)
		{
			if(date.charAt(i)==',') {commas[index]=i;index++;}
		}

		int day=Integer.parseInt(date.substring(0,commas[0]));
		int month=Integer.parseInt(date.substring(commas[0]+2,commas[1]));
		int year=Integer.parseInt(date.substring(commas[1]+2,date.length()));
		
		if(isLeapYear(year)){	
			if(day<lpmonths[month-1]) day++;
			else {
				day=1;
				if(month<12) month++;
				else {
					month=1;
					year++;
				}
			}
		}
		else{
			if(day<months[month-1]) day++;
			else {
				day=1;
				if(month<12) month++;
				else {
					month=1;
					year++;
				}
			}
		}
		System.out.format("%d, %d, %d",day,month,year);
		
		sc.close();

	}
	public static boolean isLeapYear(int year){
		if(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) return true;
		else return false;
	}

}
