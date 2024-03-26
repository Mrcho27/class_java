package task;
//문제: 두 개의 스레드가 공유 변수 x를 변경하는 작업을 수행합니다. 하나의 스레드는 x에 1을 더하고, 다른 하나는 x에서 1을 뺍니다. 
//이러한 작업을 반복하여 x가 0이 되도록 만드는 코드를 작성하세요. 
//
//단, 스레드는 Thread 클래스를 상속받거나 Runnable 인터페이스를 구현하여 작성해야 합니다.
public class Test implements Runnable{
	private int number;
	
	public Test() {
		this.number =0;
	}
	
	
	@Override
	public void run() {
		while (true) {
            synchronized (Data.class) {
                number++;
                System.out.println("Incremented x to: " + number);
                if (number == 0) {
                    System.out.println("x is now 0. Exiting increment thread.");
                    break;
                }
            }
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
            
	}
	
	
	public void sub(int number) {
		String name = Thread.currentThread().getName();
		
		synchronized (this) {
			this.number += number;
		}
		
		System.out.println(name + ": -"+ number);
		System.out.println("현재 number :" + this.number);
	}
	
}
