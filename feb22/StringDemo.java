package feb22;
public class StringDemo {
	public static void main(String[] args) {
	String s="Hello";
	System.out.println("print 1st string: "+s);
	System.out.println("Length of 1st string:"+s.length());
	String s1="world";
	System.out.println("print 2nd string: "+s);
	System.out.println("Length of 2nd string:"+s1.length());
	String s2=s.concat(s1);
	System.out.println("concat  of 1st & 2nd string:"+s2);
	String s3="Hello";
	System.out.println("print 3rd string: "+s3);
	String s4="HELLO";
	System.out.println("print 4th string: "+s4);
	if(s==s3) {
		System.out.println("print s==s3");
	}
	else {
		System.out.println("print s=!s3");
	}
	System.out.println("s &s1 are equal"+(s.equals(s3)));
	}

}
