import java.time.temporal.ChronoField;

class CarDemoClass{
	public static void main(String[] args) {
		CarDemoClass cd = new CarDemoClass();
		DemoCar c1 = new DemoCar();
		c1.setCarDetails("Mercedes", 12, 58476.11, true);
		c1.printDetails();
		
		DemoCar c2 = new DemoCar();
		c2.setCarDetails("Maruti", 16, 2923.81, false);
		c2.printDetails();

		DemoCar c3 = new DemoCar();
		c3.setCarDetails("Kwid", 20, 5847.61, false);
		c3.printDetails();

		DemoCar c4 = new DemoCar();
		c4.setCarDetails("BMW", 13, 65785.63, true);
		c4.printDetails();

		DemoCar c5 = new DemoCar();
		c5.setCarDetails("Fortuner", 8, 43857.08, true);
		c5.printDetails();
		double max = 0;
		double[] arrayCarPrice = {c1.getPrice(), c2.getPrice(), c3.getPrice(), c4.getPrice(), c5.getPrice()};
		for(int i = 0 ; i<arrayCarPrice.length ; i++) {
			if(arrayCarPrice[i] >= max) 
				max = arrayCarPrice[i];
		}
		if(c1.getPrice() == max) {
			System.out.println("Costliest car is : "+c1.getCarName());
		}
		if(c2.getPrice() == max) {
			System.out.println("Costliest car is : "+c2.getCarName());
		}
		if(c3.getPrice() == max) {
			System.out.println("Costliest car is : "+c3.getCarName());
		}
		if(c4.getPrice() == max) {
			System.out.println("Costliest car is : "+c4.getCarName());
		}
		if(c5.getPrice() == max) {
			System.out.println("Costliest car is : "+c5.getCarName());
		}
		cd.chooseMyCar(c1, c2, c3, c4, c5);
	}

	public void chooseMyCar(DemoCar c1, DemoCar c2, DemoCar c3, DemoCar c4, DemoCar c5) {
		if(c1.getMilage() > 10 && c1.getPrice() < 23000 ) {
			System.out.println(c1.getCarName());
		}
		if(c2.getMilage() > 10 && c2.getPrice() < 23000 ) {
			System.out.println(c2.getCarName());
		}
		if(c3.getMilage() > 10 && c3.getPrice() < 23000 ) {
			System.out.println(c3.getCarName());
		}
		if(c4.getMilage() > 10 && c4.getPrice() < 23000 ) {
			System.out.println(c4.getCarName());
		}
		if(c5.getMilage() > 10 && c5.getPrice() < 23000 ) {
			System.out.println(c5.getCarName());
		}
	}
	
}
