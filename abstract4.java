import java.util.Scanner;
abstract class first{
	int a, b, r;
	abstract void input();
	abstract void add();
	abstract void result();
	Scanner sc=new Scanner(System.in);
}
public class abstract4 extends first{
void input() {
	System.out.println("Enter two numbers:");
a=sc.nextInt();
b=sc.nextInt();
}
void add() {
	r= a+b ;
}
void result() {
		System.out.println("sum of two numbers:"+r);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
abstract4 abs= new abstract4();
abs.input();
abs.add();
abs.result();
	}

}
