
public class Task20 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			int cpy;
			if(i==10) cpy=0;
			else cpy=i;
			for(int j=1;j<=10;j++){
				System.out.print(cpy+" ");
				if(cpy<9) cpy++;
				else cpy=0;
			}
			System.out.println("");
		}

	}

}
/*
1 2 3 4 5 6 7 8 9 0
2 3 4 5 6 7 8 9 0 1
3 4 5 6 7 8 9 0 1 2
4 5 6 7 8 9 0 1 2 3
5 6 7 8 9 0 1 2 3 4
6 7 8 9 0 1 2 3 4 5
7 8 9 0 1 2 3 4 5 6
8 9 0 1 2 3 4 5 6 7
9 0 1 2 3 4 5 6 7 8
0 1 2 3 4 5 6 7 8 9 
*/