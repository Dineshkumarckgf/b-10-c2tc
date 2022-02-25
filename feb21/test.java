package feb21;

public class test {
static int a=10;
static int b;
static {
	System.out.println("static block");
	b=a*4;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
	}

}
