import java.util.ArrayList;
import java.util.Collections;

public class FillExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(40);
		al.add(9);
		System.out.println("Array List 1 :");
		al.forEach(item-> System.out.print(item+" "));
		System.out.println();
		
		ArrayList al2 = new ArrayList();
		al2.add("Ten");
		al2.add("Forty");
		al2.add("Nine");
		System.out.println("Array List 2 :");
		al2.forEach(item -> System.out.print(item+" "));
		
		System.out.println("After filling: ");
		Collections.fill(al, al2);
		al.forEach(item-> System.out.println(item));
		
	}

}
