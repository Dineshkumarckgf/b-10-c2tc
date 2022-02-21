package feb17;

public class multi extends Thread {
public void run() {
	System.out.println("thread 1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
multi t1= new multi();
	t1.start();
	}

}
