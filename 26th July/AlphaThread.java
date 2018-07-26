class AlphaThread extends Thread{
	public void run() {
		for(char c = 'A' ; c<='E'; c++)
			System.out.print(c);
	}
}

class MyThread extends Thread{
	public void run() {
		this.setName("My Thread");
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.print(i);
		}
		System.out.println("\n"+this.getName());
	}	
}
