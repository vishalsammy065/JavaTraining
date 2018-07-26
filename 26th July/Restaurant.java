
public class Restaurant {
	public synchronized void takeLunch(String name) {
		System.out.println("Taking lunch.."+name);
	}
}
