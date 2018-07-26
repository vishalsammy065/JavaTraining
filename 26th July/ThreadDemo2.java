package runnable.example;

class AlphaThread implements Runnable{

	@Override
	public void run() {
		for(char c = 'A' ; c<='E'; c++)
			System.out.print(c);
	}
	
}

class NumberThread implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 5;i++)
			System.out.print(i);
	}
}
public class ThreadDemo2 {
	public static void main(String[] rags) {
		Thread at = new Thread(new AlphaThread());
		Thread nt = new Thread(new NumberThread());
		at.start();
		nt.start();
	}
}
