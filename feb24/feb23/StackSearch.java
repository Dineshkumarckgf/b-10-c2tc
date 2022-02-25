package feb23;
import java.util.Stack;
public class StackSearch {
	public static void main(String[] args) {
		Stack<String>s1=new Stack<String>();
		s1.push("raghul");
		s1.push("ganesh");
System.out.println("the stack is:"+s1);
System.out.println("does the stack contain:"+s1.search("ganesh")); 
System.out.println("does the stack contain:"+s1.search("vaishu")); 
	}
}
