package feb24;
import java.util.Iterator;
import java.util.Stack;
public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Integer> stack = new Stack<Integer>();
     stack.add(10);
     stack.add(20);
     stack.add(30);
     stack.add(40);
     stack.add(50);
     System.out.println("Stack: " + stack);
     Iterator<Integer> value = stack.iterator();
     System.out.println("The iterator values are: ");
     while (value.hasNext()) {
         System.out.println(value.next());
	}

}}
