package feb24; 
import java.util.*;  
public class ArrayDemo1 {
	 public static void main(String[] args)  
	    {  
	ArrayList<String> cNames = new ArrayList<String>();  
    
    cNames.add("Delhi");  
    cNames.add("Mumbai");  
    cNames.add("Kolkata");  
    cNames.add("Bangalore");  
    cNames.add("Chennai");  

   
    Iterator<String> iterator = cNames.iterator();  

    System.out.println("CityNames : ");  

    while (iterator.hasNext())  
        System.out.print(iterator.next() + " ");  

    System.out.println(); 
}}
