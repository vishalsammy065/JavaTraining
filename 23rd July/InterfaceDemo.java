
public class InterfaceDemo implements TVRemote{

	public static void main(String[] args) {
		Samsung samsung = new Samsung();
		samsung.changeChannel();
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Off");
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("On");
	}

	@Override
	public void changeChannel() {
		// TODO Auto-generated method stub
		System.out.println("Change Channel");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Increase Vol");
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Decrease volume");
	}

}

