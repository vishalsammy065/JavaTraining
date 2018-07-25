import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(9);
		al.add(45);
		al.add(60);
		al.forEach(item-> System.out.print(item+" "));
		System.out.println();
		System.out.println(Collections.binarySearch(al, 45));
		
	}
}
