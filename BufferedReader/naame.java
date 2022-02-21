package BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class naame {
	public static void main(String[] args)throws IOException{

        System.out.println("Enter your name : ");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
 
        // Reading data using readLine
        String name = reader.readLine();
 
        // Printing the read line
        System.out.println("Hello " + name + "!!!");
    }
}

