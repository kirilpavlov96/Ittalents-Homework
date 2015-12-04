
public class Task14 {

	static long fact(int n) {
		return (n == 1) ? 1 : n * fact(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));
	}

}
