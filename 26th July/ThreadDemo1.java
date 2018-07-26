
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		AlphaThread at = new AlphaThread();
		obj.start();
		at.start();
		//System.out.println(Thread.currentThread().getName());	
	}
}
