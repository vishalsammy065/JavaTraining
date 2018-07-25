import java.util.Comparator;

public class BrandComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Car c1 = (Car) arg0;
		Car c2 = (Car) arg1;
		return c1.brand.compareTo(c2.brand);
	}
	
}
