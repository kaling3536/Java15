class CTest5 implements Runnable {
	private String id;

	public CTest5(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep((int) (2000 * Math.random()));
			} catch (InterruptedException e) {
			}
			System.out.println(id + " " + i);
		}
	}
}

public class hw15_10 {
	public static void main(String args[]) {
		CTest5 hi = new CTest5("Hello");
		CTest5 bye = new CTest5("Good bye");
		CTest5 morning = new CTest5("Good morning");
		CTest5 night = new CTest5("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
