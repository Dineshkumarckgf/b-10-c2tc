import java.util.Scanner;
interface num{
	void input();
	void add();
	}public class interface2 implements num{

	int x,y,z;
	Scanner sc=new Scanner(System.in);
	
	public void input() {
		System.out.println("Enter the 2 numbers :");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	public void add() {
		z = x+y;
	}
	void display() {
		System.out.println("Sum is :" + z);
	}
  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface2 t= new interface2();
		t.input();
		t.add();
		t.display();
	}

}
