package feb23;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
LinkedList<String> list=new LinkedList<String>();
list.add("twinkle");
list.add("little");
list.add("star");
list.add("vaishu");
list.add("is");
list.add("super");
list.add("star");
System.out.println("initial linked list:"+list);
System.out.println("the linked list element is :"+list.get(2));
list.offerFirst("up");
System.out.println("linked list After insertion using offerFirst():"+list);
list.offerLast("down");
System.out.println("linked list After insertion using offerLast:"+list);
System.out.println("head of the list:"+list.peek());
System.out.println(" last element inlinked list:"+list.peekLast());
list.remove();
System.out.println(" final linked list:"+list);






	}

}
