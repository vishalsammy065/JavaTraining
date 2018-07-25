import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45);
		al.add(9);
		al.forEach(item-> System.out.print(item+" "));
		System.out.println();
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
	}

}
