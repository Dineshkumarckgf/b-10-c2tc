package basics;

public class InheritanceUsedForOverridingPolymorphismDemo extends A{
int a=2;
int b=3;
int c;
void sum() {
	c=a+b;
	System.out.println("result:" + c);
	
}
void multiplication(int a, double b) {
	System.out.println("Parent Result of multiplication:"+(a*b));
	System.out.println("hello child");
	
}
void display() {
	System.out.println("hello child");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceUsedForOverridingPolymorphismDemo iufopd = new InheritanceUsedForOverridingPolymorphismDemo();
		iufopd.sum();
		iufopd.multiplication(3,2.5);
		A a=new A();
		a.display();
		iufopd.display();
		}

}
class A{
	void multiplication(int a, double b) {
		System.out.println("parent result of multiplication:"+(a*b));
	}
	void display() {
		System.out.println("hello parent");
	}
	
}