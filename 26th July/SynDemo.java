class RestaurantThread extends Thread {
	String name;
	Restaurant rt;
	public RestaurantThread(String name, Restaurant rt) {
		this.name = name;
		this.rt = rt;
	}
	
	@Override
	public void run() {
		rt.takeLunch(this.name);
	}
}

public class SynDemo {
	public static void main(String[] args) {
		Restaurant rt = new Restaurant();
		RestaurantThread rtt = new RestaurantThread("Vishal", rt);
		RestaurantThread rtt2 = new RestaurantThread("Aman", rt);
		rtt.start();
		rtt2.start();
	}
}
