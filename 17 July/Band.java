
public class Band {
	private String bandName;
	private String[] singers;
	private String[] guitarists;
	private String[] drummer;
	private String[] keyboardPlayer;
	
	public String getBandName() {
		return bandName;
	}
	
	public void setBandName(String bandName, String[] singers, String[] guitarists, String[] drummer, String[] keyboardPlayer) {
		this.bandName = bandName;
		this.singers = singers;
		this.guitarists = guitarists;
		this.drummer = drummer;
		this.keyboardPlayer = keyboardPlayer;
	}
	
	public void printBandDetails() {
		System.out.println();
		System.out.println("Band Name: "+this.bandName);
		System.out.println("Singers are : ");
		for(String i : this.singers) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Guitarists are : ");
		for(String i : this.guitarists) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Drummers are : ");
		for(String i : this.drummer) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Keyboard Players are : ");
		for(String i : this.keyboardPlayer) {
			System.out.println(i);
		}
	}
	public int countMembers() {
		return this.singers.length + this.guitarists.length + this.drummer.length + this.keyboardPlayer.length;
	}
	
}
