
class DemoCar {
	private String carName;
	private double milage;
	private double price;
	boolean isLux;
	public void setCarDetails(String carName, double milage, double price, boolean isLux) {
		this.carName = carName;
		this.milage = milage;
		this.price = price;
		this.isLux = isLux;
	}
	
	public void printDetails() {
		System.out.println("Car Name is : "+this.carName+" and milage is : "+this.milage+". It is priced at : "+this.price+"."+" It is a "+(isLux?"Luxary Car":" Simple Car!"));		
	}
	
	public double getPrice() {
		return this.price;
	}

	public String getCarName() {
		return carName;
	}

	public int getMilage() {
		return (int)this.milage;
	}
}
