import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] rags) {
		TreeMap tm = new TreeMap();
		tm.put("1", "Abc");
		tm.put("2", "Xyz");
		System.out.println(tm);
		Iterator it = (tm.keySet()).iterator();
		
		while(it.hasNext()) {
			System.out.println(tm.get(it.next()));
		}
	}
}
