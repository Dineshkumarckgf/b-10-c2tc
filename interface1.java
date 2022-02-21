interface chocolate{
	void eat();
}
class darkchocolate implements chocolate{
	public void eat() {
	System.out.println("EATING DARK CHOCOLATE HAPPY");
}}
class whitechocolate implements chocolate{
	public void eat() {
System.out.println("EATING WHITE CHOCOLATE VERY VERY HAPPY");}
	}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
chocolate choc= new darkchocolate();
chocolate choc1=new whitechocolate();
choc1.eat();
choc.eat();}
}
