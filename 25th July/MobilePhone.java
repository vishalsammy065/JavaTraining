class MobilePhone {
	String mobileName;
	int price;
	public MobilePhone(String mobileName2, int price2) {
		super();
		this.mobileName = mobileName2;
		this.price = price2;
	}
	
	@Override
	public String toString() {
		return this.mobileName+" "+ this.price;
	}
	
	@Override
	public boolean equals(Object obj) {
		MobilePhone mm = (MobilePhone) obj;
		if (this.mobileName.equals(mm.mobileName) && this.price == mm.price)
			return true; //same object
		else
			return false; //different objects
	}
	
	@Override
	public int hashCode() {
		return this.price * 10;
	}
}