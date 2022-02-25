package feb20;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	String a= "i love you god";
	char c=a.charAt(24);
	System.out.println(c);
} catch(StringIndexOutOfBoundsException e) {
	System.out.println("StringIndexOutOfBoundsException");
}
	}

}
