package feb23;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class QueueDemo2 {
	public static void main(String[] args)throws IllegalStateException  {
	        Queue<Integer> Q = new LinkedBlockingQueue<Integer>(3);
	        if (Q.offer(10))
	            System.out.println("The Queue is not full" + " and 10 is inserted");
	        else
	            System.out.println("The Queue is full");
	  
	        if (Q.offer(15))
	            System.out.println("The Queue is not full"+ " and 15 is inserted");
	        else
	            System.out.println("The Queue is full");
	  
	        if (Q.offer(25))
	            System.out.println("The Queue is not full" + " and 25 is inserted");
	        else
	            System.out.println("The Queue is full");
	  
	        if (Q.offer(20))
	            System.out.println("The Queue is not full" + " and 20 is inserted");
	        else
	            System.out.println("The Queue is full");
	        System.out.println("Queue: " + Q);
	    }
}
