import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(90);
		al.add(45);
		al.add(60);
		al.forEach(item-> System.out.print(item+" "));
		Collections.sort(al);
		System.out.println();
		al.forEach(item-> System.out.print(item+" "));
	}

}
