package task;

public class Task01 {
	public static void main(String[] args) {
		Test test = new Test();
		
		Thread th1 = new Thread(test,"쓰레드 -1");
		Thread th2 = new Thread(test,"쓰레드 -2");
		
		th1.start();
		th2.start();
		
	}
}
