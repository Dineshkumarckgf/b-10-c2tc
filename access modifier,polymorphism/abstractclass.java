package Febrau11;
abstract class Vehicle{
	int a;
	int b;
	abstract void m1();
	void m2() {
}}
	class Activa extends Vehicle{
		void m1() {
	System.out.println("hi vehicle");
		}
		
	}
public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Activa a= new Activa();
	a.m1();
	a.m2();
	}
}

