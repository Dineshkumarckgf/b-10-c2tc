package feb25;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Raghul");  
		  al.add("Vijay");  
		  al.add("ganesh");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}

