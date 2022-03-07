package feb25;
import java.util.*;

public class ListIteratorDemo {
	
	    public static void main(String[] args)
	    {
	        List<String> names = new LinkedList<>();
	        names.add("Welcome");
	        names.add("To");
	        names.add("java");
	        names.add("world");
	       
	        ListIterator<String> namesIterator = names.listIterator();
	  
	      
	        while (namesIterator.hasNext()) {
	            System.out.println(namesIterator.next());
	        }
	  
	        
	        for (String s : names) {
	            System.out.println(s);
	        }
	    }}
