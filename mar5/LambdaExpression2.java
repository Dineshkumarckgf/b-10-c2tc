package mar3;
import  java.util.ArrayList;
interface Add{
	int add(int b,int c);
}
public class LambdaExpression2 {
	public static void main(String[] args) {
	ArrayList<Integer>a=new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	a.forEach((n)->{System.out.println(n);});
	System.out.println("lambda expression ");
	Add add1=(b,c)->(b=c);
	System.out.println(add1.add(10, 20));

	}

}
