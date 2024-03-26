package anonymousTask01;

public class Main {
	public static void main(String[] args) {
		ClassA a = new ClassA() {
			
			@Override
			public void method2() {
				System.out.println("익명클래스에서 재정의!!!");
				
			}
		};
		
		a.method1();
		a.method2();
	}
}
