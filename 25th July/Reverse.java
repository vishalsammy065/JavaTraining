import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(9);
		al.add(45);
		al.add(60);
		Collections.reverse(al);
		al.forEach(item-> System.out.println(item));
		
	}

}
