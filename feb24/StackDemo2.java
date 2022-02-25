package feb24;
import java.util.Iterator;
import java.util.Stack;
public class StackDemo2 {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("Welcome");
        stack.add("To");
        stack.add("techno");
        stack.add("serve");
        stack.add("bangalore");
        System.out.println("Stack: " + stack);
        Iterator<String> value = stack.iterator();
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
	}

}
