import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
	public static void main(String[] arghs) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45);
		al.add(9);
		al.forEach(item-> System.out.print(item+" "));
		System.out.println();
		Collections.shuffle(al);
		al.forEach(item-> System.out.print(item+" "));
	}
}
