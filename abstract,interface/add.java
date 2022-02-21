package feb11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class add {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
int a,b,c;
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
System.out.println("enter the two numbers:");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.println("sum of two numbers :" +c);
	}

}
