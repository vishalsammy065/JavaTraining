
public class Furniture {
	double price;
	public double calculateDiscount(Cot c) {
		return c.getPrice() * 0.1;
	}
	
	public double calculateDiscount(Chair cc) {
		return cc.getPrice() * 0.2;
	}
	
	public double calculateDiscount(DiningTable dt) {
		return dt.getPrice() * 0.25;
	}

}
