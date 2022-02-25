package feb23;
import java.util.*;
class Student {
    int rollno;
    String name, address;
    public Student(int rollno, String name,String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString()
    {
        return this.rollno + " "+ this.name + " "+ this.address;
    }
}
class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
public class ArrayDemo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = { new Student(64, "raghul", "chennai"),new Student(11, "ganesh", "krishnagiri"), new Student(12, "pavi", "andhra") };
System.out.println("Unsorted");
for (int i = 0; i < arr.length; i++)
  System.out.println(arr[i]);
Arrays.sort(arr, new Sortbyroll());
System.out.println("\nSorted by rollno");
for (int i = 0; i < arr.length; i++)
  System.out.println(arr[i]);
	}
}
