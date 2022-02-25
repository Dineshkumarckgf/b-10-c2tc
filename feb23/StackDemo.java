package feb23;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack<String>ob=new Stack<String>();
		ob.push("4");
		ob.push("hi");
		ob.push("i");
		ob.push("am");
		ob.push("vaish");
		ob.push("papaa");
		ob.push("good");
		ob.push("night");
		ob.push("monkey");
	
		
		System.out.println(ob);
		System.out.println("initial stack:" +ob);
		System.out.println("popped element:"+ob.pop());
		System.out.println("stack after pop operation:"+ob);
		System.out.println("peek of the stack is:"+ ob.peek());
		System.out.println("is the stack empty?"+ob.empty());
		}}
