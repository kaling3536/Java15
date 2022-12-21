#abc
class CTest extends Thread

{
	private String id;

	public CTest(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 100000000; j++)
				;
			System.out.println(id + " " + i);
		}
	}
}

public class hw15_2 {
	public static void main(String args[]) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		hi.run();
		bye.run();
	}
}

#d
程式執行時,會先將"Hello 1"~"Hello 5"列印完畢之後,再印出"Good bye 1"~"Good
bye 5"。要使用多執行緒時,必須要用 start() method 來啟動,由 start() method 在
排程器中登錄該執行緒,當這個執行緒開始執行,run() method 自然就會被呼叫。
像 hw15_2 直接呼叫 run() method,只是在程式中將 run() method 執行,並不會啟
動多執行緒。
