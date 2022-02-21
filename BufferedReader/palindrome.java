package BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
public class palindrome {

	public static void main(String[] args)throws IOException {
		System.out.println("Enter a string");

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String inputString = br.readLine();
	    
	    StringBuffer sb = new StringBuffer(inputString);
	    
	    sb.reverse();
	    
	    String newStrnig = sb.toString();
	    
	    if(newStrnig.equalsIgnoreCase(inputString))
	      System.out.println(inputString + " is a Palindrome");
	    else
	      System.out.println(inputString + " is NOT a Palindrome");
	  }

	}
	