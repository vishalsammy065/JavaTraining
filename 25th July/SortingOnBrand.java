import java.util.ArrayList;
import java.util.Collections;

public class SortingOnBrand {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Car("Red", "Ford", 100324));
		al.add(new Car("Green", "Maruti", 10032));
		al.add(new Car("Black", "BMW", 10034));
		Collections.sort(al);
		al.forEach(item-> System.out.println(item));
	}
}
