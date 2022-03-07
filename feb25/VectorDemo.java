package feb25;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>(4);  
       
        vec.add("lemon");  
        vec.add("Lotus");  
        vec.add("Dog");  
        vec.add("Egg");  
      
        System.out.println("Size is: "+vec.size());  
        System.out.println("Default capacity is: "+vec.capacity());  
         
        System.out.println("Vector element is: "+vec);  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");  
        
        System.out.println("Size after addition: "+vec.size());  
        System.out.println("Capacity after addition is: "+vec.capacity());  
       
        System.out.println("Elements are: "+vec);  
             
          if(vec.contains("lemon"))  
          {  
             System.out.println("lemon is present at the index " +vec.indexOf("lemon"));  
          }  
          else  
          {  
             System.out.println("lemon is not present in the list.");  
          }  
          
        System.out.println("The first element of the vector is = "+vec.firstElement());   
       
        System.out.println("The last element of the vector is = "+vec.lastElement());   
	}

}
