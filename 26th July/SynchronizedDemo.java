class Greeting {
	//at a time only one thread will access this method
	public synchronized  void sayHello(String name) {
		System.out.print("!");
		System.out.print(name);
		System.out.println("!");
	}
}

class GreetingThread extends Thread {
	String name;
	Greeting g;
	public GreetingThread(String name, Greeting g) {
		this.name = name;
		this.g = g;
	}
	
	public void run() {
		g.sayHello(this.name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		Greeting g = new Greeting();
		GreetingThread gt1 = new GreetingThread("Vishal", g);
		GreetingThread gt2 = new GreetingThread("Jack", g);
		gt1.start();
		gt2.start();
		
	}
}
