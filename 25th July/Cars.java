
public class Cars implements Comparable{
	String color;
	String brand;
	double price;
	public Cars(String color, String brand, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.color + " "+this.brand+" "+this.price;
	}

	@Override
	public int compareTo(Object o) {
		Cars cc = (Cars) o;
		if(this.price == cc.price) {
			return 0;
		}
		else if (this.price < cc.price){
			return -1;
		} else {
			return 1;
		}
	}
}
