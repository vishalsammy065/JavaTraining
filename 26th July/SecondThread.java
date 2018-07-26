class MyThread2 extends Thread{
	@Override
	public void run() {
		this.setName("Thread2");
		for (int i = 15; i <= 20;i++)
			System.out.print(i+" ");
		System.out.println("\n"+this.getName());
	}
}
public class SecondThread {

	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		mt2.start();
	}

}
