package feb23;
import java.util.Arrays;
public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = { 10, 20, 15, 22, 35 };
        Arrays.parallelSort(intArr);
        System.out.println("Integer Array: "+ Arrays.toString(intArr));
	}

}
