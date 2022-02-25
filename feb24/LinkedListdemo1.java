package feb24;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lin = new LinkedList<>();
        lin.add(5);
        lin.add(100);
        lin.add(41);
        lin.add(40);
        lin.add(7);
        iterateUsingIterator(lin);
	}
    public static void iterateUsingIterator(LinkedList<Integer> linkedList){
  
        System.out.print("Iterating the LinkedList using Iterator : ");
             Iterator<Integer> it = linkedList.iterator();
  
       
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
  
	}

}
