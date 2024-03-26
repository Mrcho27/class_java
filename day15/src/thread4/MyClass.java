package thread4;

public class MyClass implements Runnable {
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		for(int i=0;i<10;i++) {
			System.out.println(name);
			
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name+"쓰레드 종료!");
		
		
		
		
		
	}
}
