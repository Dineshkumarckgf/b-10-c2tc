package Feb19;

public class TestThrow1 {
static void validate(int age)
{
	if (age<20)
		throw new ArithmeticException("not valid");
	else
		System.out.println("welcome to CLUB");
}
	public static void main(String[] args) {
	try {
		validate(14);
	} catch (Exception ex) {
		
		System.out.println("rest of the code..........................");
	}
	}

}
