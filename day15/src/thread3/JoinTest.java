package thread3;

public class JoinTest {
	public static void main(String[] args) {
		Runnable r1 = () ->{
			String name = Thread.currentThread().getName();
			
			for(int i=0; i<10; i++) {
				System.out.println(name);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(name+"쓰레드 종료!!");
		};
		
		Thread th1 = new Thread(r1,"th1");
		Thread th2 = new Thread(r1,"th2");
		
		th1.start();
		th2.start();
		
		try {
			th2.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		String name = Thread.currentThread().getName();
		
		for(int i=0; i<10; i++) {
			System.out.println(name);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
