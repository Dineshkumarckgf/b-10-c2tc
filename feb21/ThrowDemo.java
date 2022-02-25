package feb21;

public class ThrowDemo {
void validate(int income) {
	try {
		if(income>5)
		{
			throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("sorry!!");
		}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowDemo td= new ThrowDemo();
td.validate(10);
	System.out.println("WELCOME");
	}

}
