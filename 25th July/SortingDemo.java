import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(3);
		Collections.sort(al);
		al.forEach(item-> System.out.println(item));
		al.removeAll(al);
		
		//for objects
		al.add(new Cars("Red", "Ford", 100324));
		al.add(new Cars("Green", "Maruti", 10032));
		al.add(new Cars("Black", "BMW", 10034));
		Collections.sort(al);
		al.forEach(item-> System.out.println(item));
	}
}
