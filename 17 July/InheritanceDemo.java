class Mobile {
	public void switchOff() {
		System.out.println("Mobile Off");
	}
	
	protected void sendMessage() {
		System.out.println("Send Message");
	}
	
	protected void makeCall() {
		System.out.println("Make Call");
	}
}

class SmartPhone extends Mobile {
	public void browseInternet() {
		System.out.println("Smart Phone browser!");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		SmartPhone smt = new SmartPhone();
		smt.makeCall();
		smt.browseInternet();
		smt.makeCall();
	}
}