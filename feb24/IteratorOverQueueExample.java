package feb24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class IteratorOverQueueExample {

	public static void main(String[] args) {
		Queue<String>qu=new LinkedList<>();
		qu.add("e1");
		qu.add("e2");
		qu.add("e3");
		qu.add("e4");
	System.out.println("iterator over queue");
	qu.forEach(name ->{System.out.println(name);});
	System.out.println("itirating a queue using iterator");
	Iterator<String>qqui=qu.iterator();
	while(qqui.hasNext()) {
		String name=qqui.next();
		System.out.println(name);
	}
	System.out.println("itirating a queue using iterator and foreach");
	qqui=qu.iterator();
	qqui.forEachRemaining(name ->{System.out.println(name);});
	System.out.println("itirating a queue using iterator and for loop");
	for(String name:qu) {
		System.out.println(name);
	}
	}

}
