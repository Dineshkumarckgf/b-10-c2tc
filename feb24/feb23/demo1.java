package feb23;
import java.util.Iterator;
import java.util.LinkedList;
public class demo1 {

	public static void main(String[] args) {
		LinkedList<String>l1=new LinkedList<>();
		l1.add("hello");
		l1.add("hi");
		l1.add("hlo");
		l1.add("bad");
		Iterator<String>iterator=l1.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("initial linked list:"+l1);
		System.out.println("head of the list:"+l1.poll());
		System.out.println("linked list after removal using poll():"+l1);
	}

}
