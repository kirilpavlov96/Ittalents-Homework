
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++){
			for(int j=i;j<=9;j++){
				if(j<9)
					System.out.format("%d*%d; ",i,j);
				else
					System.out.format("%d*%d\n",i,j);
			}
		}
	}

}
