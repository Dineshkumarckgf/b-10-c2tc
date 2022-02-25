package Feb19;
import java.io.IOException;
public class Hello {
void m()throws IOException
{
	throw new IOException("device error");
}
void n() throws IOException
{
	m();
}
void p()
{
	try
	{
		n();
	}
	catch(Exception e) {
	System.out.println("exception handled");
}}
	public static void main(String[] args) {
		
Hello obj=new Hello();
obj.p();
System.out.println("--normal flow...");
	}

}
