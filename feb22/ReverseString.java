package feb22;
public class ReverseString {
	public static void main(String[] args) {
		String name="raghul";
		String reversedString="";
		char ch;
		System.out.println("original word:");
		System.out.println("raghul");
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			reversedString=ch+reversedString;
		}
		System.out.println("the reversed word:"+reversedString);
	}

}
