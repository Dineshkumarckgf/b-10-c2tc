package Feb19;

public class Testtrycatch2{
	public static void main(String[] args) {
	
try {

 int num =50/0; 
 System.out.println("error");
}
	catch(ArithmeticException e)
{
	System.out.println(e);
}
System.out.println("code running.....");
	}

}
