package BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hello {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STRING");
		
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);          
String inputString = br.readLine();
	    
	    StringBuffer sb = new StringBuffer(inputString);
	    System.out.println(inputString + " HI vaishu");
	}

}
