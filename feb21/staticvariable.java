package feb21;
class student1{
	int rollno;
	String name;
	static String college= "RGIT";
	student1(int r,String n){
	rollno=r;
	name=n;
	}
	void display() {System.out.println(rollno  +"" +  name+"" +  college);}
}
public class staticvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student1 s1= new student1(143, "raghul");
student1 s2= new student1(121, "vaishu");
s1.display();
s2.display();}

}
