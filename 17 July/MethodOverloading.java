
public class MethodOverloading {
	public static void main(String[] rags) {
		Cot c = new Cot(500.0);
		Chair cc = new Chair(650.0);
		DiningTable dt = new DiningTable(700);
		Furniture fur = new Furniture();
		System.out.println("Cot discount : "+ fur.calculateDiscount(c));
		System.out.println("Cot discount : "+ fur.calculateDiscount(cc));
		System.out.println("Cot discount : "+ fur.calculateDiscount(dt));
	}
}
