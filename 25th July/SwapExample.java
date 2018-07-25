import java.util.ArrayList;
import java.util.Collections;

public class SwapExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(90);
		al.add(45);
		al.add(60);
		al.forEach(item-> System.out.print(item+" "));
		System.out.println();
		Collections.swap(al, 0, 2);
		al.forEach(item-> System.out.print(item+" "));
	}
}
