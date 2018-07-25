import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] arsgv) {
		System.out.println("HashSet: Maintains no order");
		HashSet hsObj = new HashSet();
		hsObj.add("Vishal");
		hsObj.add("Aman");
		hsObj.add("Vishal");
		hsObj.add("Guru");
		hsObj.add("Ankur");
		System.out.println(hsObj);
		
		System.out.println("\nLinkedHashSet: Maintains orders of insertion");
		LinkedHashSet lhsObj = new LinkedHashSet();
		lhsObj.add("Vishal");
		lhsObj.add("Aman");
		lhsObj.add("Vishal");
		System.out.println(lhsObj);
		
		System.out.println("\nTreeHashSet: Maintains natural orders");
		TreeSet tsObj = new TreeSet();
		tsObj.add("Zenith");
		tsObj.add("Vishal");
		tsObj.add("Kennith");
		tsObj.add("Ankur");
		
		System.out.println(tsObj);
	}
}
