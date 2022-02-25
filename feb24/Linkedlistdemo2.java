package feb24;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Linkedlistdemo2 {
void Display(List<String>list) {
	Iterator<String>obj=list.listIterator();
	while(obj.hasNext()) {
		System.out.println("element is:"+obj.next());
	}
}
	public static void main(String[] args) {
		List<String>oj=new LinkedList<>();
		oj.add("vai");
		oj.add("vi");
		oj.add("i");
		System.out.println("element is:"+oj);
		
		 Linkedlistdemo2 lld=new  Linkedlistdemo2();
		 oj.sort(null);
		 lld.Display(oj);
		 System.out.println("-----------------------------------------------");
		 Collections.reverse(oj);
		 lld.Display(oj);
	}

}
