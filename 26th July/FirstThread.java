class DisplayThread extends Thread{
	public void run() {
		this.setName("Thread1");
		for(int i = 1; i <= 5;i++)
			System.out.print(i+" ");
		System.out.println(this.getName());
	}
}
public class FirstThread {
	public static void main(String[] args) {
		DisplayThread dt = new DisplayThread();
		dt.start();
	}
}
