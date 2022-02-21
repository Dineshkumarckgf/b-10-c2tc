package feb17;

public class multi3 implements Runnable{
public void run() {
	System.out.println("thread is running...!!!!...");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
multi3 m1 =new multi3();
Thread t1=new Thread(m1);
t1.start();
	}

}
