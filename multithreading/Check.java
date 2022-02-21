package feb17; 
 
public class Check extends R{
public	void run() {
		System.out.println("current id of A:" );
		System.out.println("current id of B:" );
		System.out.println("cold");
		System.out.println("hello");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check a= new Check();
		a.run();
		R b= new R();
		b.run();
		E e=new E();
		e.display();}}
			
class R{
			public void run() {	
				System.out.println("hi");
		}
			}
class E{
	void display()	 {	
			System.out.println("BUNNY");
	}
		}