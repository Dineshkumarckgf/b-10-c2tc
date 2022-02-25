package feb21;
import java.util.*;
class Item{
	private String itemName;
	private int quantity;
	private static int cnt=0;
	public void getItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item name:");
		itemName=sc.next();
		System.out.println("Enter item quantity:");
		quantity=sc.nextInt();
		cnt++;
	}
	public void showItem() {
		System.out.println("itemName:"+itemName +"\t quantity:"+quantity);
	} 
	public static int getCounter() {
		return cnt;
	}
}
public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {

	Item i1= new Item();
	Item i2= new Item();
	Item i3= new Item();
	i1.getItem();
	i2.getItem();
	i3.getItem();
	i1.showItem();
	i2.showItem();
	i3.showItem();
	System.out.println("total object created(total items are):"+Item.getCounter());
}catch(Exception e) {
	System.out.println(e.toString());
}
	}

}
