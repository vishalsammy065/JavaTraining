import java.util.ArrayList;
import java.util.Collections;

public class CopyExample {
	public static void main(String[] args) {
		ArrayList source = new ArrayList(10);
		source.add(10);
		source.add(40);
		source.add(9);
		System.out.println("Array List 1 :");
		source.forEach(item-> System.out.print(item+" "));
		System.out.println();
		ArrayList dest = new ArrayList(10);
		dest.add(10);
		dest.add(40);
		dest.add(9);
		Collections.copy(dest, source);
		dest.forEach(item-> System.out.print(item+" "));
	}
}
