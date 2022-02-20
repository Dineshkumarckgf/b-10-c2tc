package basics;

public class OverloadingPolymorphismDemo {
void addition(int a,int b,int c) {
	System.out.println("result:"+(a+b+c));
	
}
void addition(int a, int b) {
	System.out.println("result:"+(a+b));
	
}
void addition (int a,int b, int c,int d) {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingPolymorphismDemo olpd = new OverloadingPolymorphismDemo();
		olpd.addition(2,4,3);
		olpd.addition(1,2);
	}

}
