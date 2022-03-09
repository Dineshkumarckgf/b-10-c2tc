package mar3;
interface speak{
	public String say();
}
public class lambdaExpression {

	public static void main(String[] args) {
		speak k=()->{return "hello am speaking.";};
		System.out.println(k.say());
	}

}
