package thread2;

public class Main {
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		ClassA a2 = new ClassA();

		Thread th1 = new Thread(a1, "A");
		Thread th2 = new Thread(a2, "B");

		th1.start();
		th2.start();

		Runnable r1 = () -> {

		String name = Thread.currentThread().getName();

		for (int i = 0; i < 10; i++) {
			System.out.println(name);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println(name + "메인 쓰레드 종료!!");
	};
	
	
	
	
	
	
	
	
	Thread th3 = new Thread(() -> {

		String name = Thread.currentThread().getName();

		for (int i = 0; i < 10; i++) {
			System.out.println(name);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println(name + "메인 쓰레드 종료!!");
	},"C");
	
	
	
	
	
	th3.start();
	
	String name = Thread.currentThread().getName();

	for (int i = 0; i < 10; i++) {
		System.out.println(name);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	System.out.println(name + "메인 쓰레드 종료!!");
	
	
	
	
	
	
	}
	
}
