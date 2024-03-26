package anonymousTask02;

public class Main {
	public static void main(String[] args) {
		
		InterA a = new InterA() {
			
			@Override
			public void method3() {
				System.out.println("3333333333");
				
			}
			
			@Override
			public void method2() {
				System.out.println("22222222222");
				
			}
			
			@Override
			public void method1() {
				System.out.println("1111111111");
				
			}
		};
		
		a.method1();
		a.method2();
		a.method3();
		
	}
}
