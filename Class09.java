class CT extends Thread implements Runnable {
	private String id;
	private int sec;

	public CT(String str, int s) {
		id = str;
		sec = s;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(sec);
			} catch (InterruptedException e) {
			}
			System.out.println(id + " is running..");
		}
	}
}

public class hw15_9 {
	public static void main(String args[]) {
		CT one = new CT("Thread 1", 1000);
		CT two = new CT("Thread 2", 2500);
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);
		t1.start();
		t2.start();
	}
}
