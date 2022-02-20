package basics;

public class multiplicationtablegereator {

	public static void main(String[] args) {
		int tableNumber = 4;
		for (int counter = 1; counter <= 10; counter++) {
			int multipliedValue = tableNumber * counter;
			System.out.printf("%d * %d = %d \n" , tableNumber , counter , multipliedValue);	
		}

	}

}
