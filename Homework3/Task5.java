import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		int[] array=new int[10];
		for(int i=0;i<array.length;i++){
			array[i]=i*3;
		}
		System.out.println(Arrays.toString(array));
	}

}
