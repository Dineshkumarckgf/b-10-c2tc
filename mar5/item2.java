package mar3;
import java.util.Scanner;
public class item2 implements Cloneable   
{  
int iid;  
String iname;  
double icost;     
public item2 (int iid, String iname, double icost)  
{  
this.iid = iid;  
this.iname = iname;  
this.icost = icost;  
}  
public void showDetail()   
{  
System.out.println("item ID: "+iid);  
System.out.println("item Name: "+iname);  
System.out.println("item Cost: "+icost);  
} public static void main(String[] args) throws CloneNotSupportedException {
Scanner sc = new Scanner(System.in);  
System.out.print("Enter product ID: ");  
int iid = sc.nextInt();  
System.out.print("Enter product name: ");  
String iname = sc.next();  
System.out.print("Enter product Cost: ");  
double icost = sc.nextDouble();  
System.out.println("-------Product Detail--------");  
item2 p1 = new item2(iid, iname, icost);    
item2 p2 =(item2) p1.clone();    
p2.showDetail();  
}   
}
