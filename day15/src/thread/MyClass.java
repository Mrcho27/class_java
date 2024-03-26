package thread;

public class MyClass extends Thread{
	private String str;

	public MyClass(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(str+"종료!");
	}

	}
