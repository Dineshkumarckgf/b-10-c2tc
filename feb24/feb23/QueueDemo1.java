package feb23;
import java.util.*;
public class QueueDemo1 {
	public static void main(String[] args) {
		Queue<String> prs = new PriorityQueue<>();
		 
        prs.add("c");
        prs.add("or");
        prs.add("yamini");
        prs.add("papu");
        System.out.println("Initial Queue " + prs);
        System.out.println(prs.peek());
        prs.remove("papu");
 
        System.out.println("After Remove " + prs);
 
        System.out.println("Poll Method " + prs.poll());
 
        System.out.println("Final Queue " + prs);
	}

}
