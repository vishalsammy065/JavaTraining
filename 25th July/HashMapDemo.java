import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("101", "Vishal");
		hm.put("102", "Jack");
		hm.put("103", "Peter");
		hm.put("103", "Aman");
		System.out.println(hm);
		
		//iterate hashmap
		//method 1 
		System.out.println(hm.get("103"));
		
		//method 2
		Iterator it = (hm.keySet()).iterator();
		while(it.hasNext()) {
			System.out.println(hm.get(/*key*/(String) it.next()));
		}
		Runtime.getRuntime().gc();
	}

}
