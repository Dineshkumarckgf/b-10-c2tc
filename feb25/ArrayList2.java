package feb25;
import java.util.ArrayList;
public class ArrayList2 {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>(); 
	  list.add("Mango");//Adding object in    
	  list.add("Apple");    
	  list.add("Banana");    
	  list.add("Grapes");    
	  for(String fruit:list)    
	    System.out.println(fruit);   
}
}