import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		 LinkedList ll=new LinkedList();  
		  ll.add("Ravi");  
		  ll.add("Vijay");  
		  ll.add("Ravi");  
		  ll.add("Ajay");  
		  
		  //first method
		  for(int i = 0; i < ll.size(); i++)
			  System.out.println(ll.get(i));
		  
		  System.out.println();
		  
		  //2nd method
		  Iterator itr=ll.iterator(); 
		  while(itr.hasNext()) 
		   System.out.println(itr.next());  
		  
		  ListIterator lt = ll.listIterator();
		  while(lt.hasNext())
			  lt.next();
		  
		  System.out.println();
		  
		  while(lt.hasPrevious()) {
			  System.out.println(lt.previous());
		  }
	}
}
