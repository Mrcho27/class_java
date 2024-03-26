package thread;

public class Main {
	public static void main(String[] args) {
		
		MyClass c1 =new MyClass("#");
		MyClass c2 =new MyClass("*");
//		멀티쓰레드라고 생각할 수 있지만 단일쓰레드로 실행된다.
//		단순히 run()에 재정의한 코드를 실행시킨것이다.
//		c1.run();
//		c2.run();
		
		c1.start();
		c2.start();
		
		
		
		
		
		for(int i= 0; i<10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
