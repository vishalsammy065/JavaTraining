
public class Car implements Comparable{
	String color;
	String brand;
	double price;
	public Car(String color, String brand, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public int compareTo(Object o) {
		Car c = (Car)o;
		return this.brand.compareTo(c.brand);
	}
	
	@Override
	public String toString() {
		return this.color + " "+this.brand+" "+this.price;
	}
}
