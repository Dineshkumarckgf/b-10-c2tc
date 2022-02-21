package BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class multiplicationtable {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);	
		BufferedReader br = new BufferedReader(isr);
System.out.println("enter a number: ");
		int num=Integer.parseInt(br.readLine());
		 
        System.out.println("*****MULTIPLICATION TABLE*****");
 
 
            for(int j=1; j<=10; j++)
            {
                System.out.println(num+ "*" +j+ "="  +num*j );
	    }}	
}
