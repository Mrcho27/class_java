package inter3;

public interface InterA {
	void method1();
	
	public default void method2() { //인터페이스에 public은 기본적으로 다붙어있음
		System.out.println("method2!!!");
	}
	
	static void method3() {
		System.out.println("method3!!!");
	}
	
	private void method4() {
		
	}
}
