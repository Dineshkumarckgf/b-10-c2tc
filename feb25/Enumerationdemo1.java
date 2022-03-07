package feb25;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
public class Enumerationdemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList(Arrays.asList( new String[] {"Apple", "Cat", "Dog", "Rat"}));
	      Vector v = new Vector(list);
	      delete(v, "Dog");
	   }
	private static void delete(Vector v, String name) {
	      Enumeration e = v.elements();
	      while (e.hasMoreElements()) {
	         String s = (String) e.nextElement();
	         if (s.equals(name)) {
	            v.remove(name);
	         }
	      }
	     
	      System.out.println("The names are:");
	      e = v.elements();
	      while (e.hasMoreElements()) {
	         
	         System.out.println(e.nextElement());
	      }
	}

}
