package mar3;
import java.util.*;
import java.util.stream.Stream;
class item{
	int id;
	String name;
	int rate;
	public item(int id,String name, int rate) {
		super();
		this.id=id;
		this.name=name;
		this.rate=rate;
	}
}
public class lambdaExpression1 {
	public static void main(String[] args) {
		List<item>List=new ArrayList<item>();
		List.add(new item(1,"apple",50));
		List.add(new item(2,"rice",80));
		List.add(new item(3,"chocolate",150));
		List.add(new item(4,"juice",20));
Stream<item>filtered_data=List.stream().filter(p->p.rate>100);
filtered_data.forEach(item->System.out.println(item.name+":"+item.rate));
	}

}
