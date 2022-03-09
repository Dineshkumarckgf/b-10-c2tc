package mar7;
import java.util.Arrays;
import java.util.List;
public class StreamAPIDemo1 {
	public static void main(String[] args) {
	List<Integer> values = Arrays.asList(1,2,3,4,5,6);
	values.forEach(StreamAPIDemo1::doubleIt);
	}
	public static void doubleIt(int i) {
		System.out.println(i*2);
}
}