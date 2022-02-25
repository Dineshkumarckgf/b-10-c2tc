package feb22;

public class Test {

	public static void main(String[] args) {
		String s1="HELLO";
		String s2="hello";
		String s3="HELLO ";
		String s4= new String("HELLO");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
