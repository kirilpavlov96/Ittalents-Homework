
public class Task12 {

	public static void main(String[] args) {
		for(int i=100;i<=999;i++)
		{
			int cpy=i;
			int dig1=cpy%10;
			cpy/=10;
			int dig2=cpy%10;
			cpy/=10;
			int dig3=cpy%10;
			if(dig1!=dig2 && dig1!=dig3 && dig2!=dig3) System.out.println(i);
		}

	}

}
