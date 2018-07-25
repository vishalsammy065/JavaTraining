import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {
	public static void main(String[] rags) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("1", "Abc");
		lhm.put("2", "Xyz");
		System.out.println(lhm);
		Iterator it = (lhm.keySet()).iterator();
		
		while(it.hasNext()) {
			System.out.println(lhm.get(it.next()));
		}
	}
}
