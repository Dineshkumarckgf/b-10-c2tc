package Feb19;

public class TestMultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		} catch (ArithmeticException e) {
			System.out.println("task 1 completed");
		}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("task2");
	}catch(Exception e) {
		System.out.println("task2 completed");
	}
		System.out.println(".....rest of the code...");
}
}
