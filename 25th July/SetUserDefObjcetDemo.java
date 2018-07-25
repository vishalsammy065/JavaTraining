import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class SetUserDefObjcetDemo {

	public static void main(String[] args) {
		MobilePhone m1 = new MobilePhone("Samsung", 20000);
		MobilePhone m2 = new MobilePhone("Samsung", 20000);
		MobilePhone m3 = new MobilePhone("Samsung", 30000);
		HashSet hs = new HashSet();
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		//System.out.println(hs);
		//since Java 8
		hs.forEach(item-> System.out.println(item));
		
		 ArrayList<Integer> arrli = new ArrayList<Integer>(10);
	     for (int i=1; i<=5; i++)
	         arrli.add(i);
	     
	     //since Java 8
	     arrli.forEach(item-> System.out.println(item));
	}
}
