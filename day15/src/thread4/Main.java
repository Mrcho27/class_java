package thread4;

public class Main {
	public static void main(String[] args) {
		MyClass a1 = new MyClass();
		MyClass a2 = new MyClass();
		
		Thread th1 = new Thread(a1,"A");
		Thread th2 = new Thread(a2,"B");
		
		th1.start();
		th2.start();	
		
		Runnable r1 = () -> {
			String name = Thread.currentThread().getName();
			for (int i=0; i<10; i++) {
				System.out.println(name);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name + "메인쓰레드종료!");
		};
		
		
		
		
		
	}

}
