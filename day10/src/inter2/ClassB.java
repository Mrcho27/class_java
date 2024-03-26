package inter2;

public class ClassB extends ClassA implements InterA, InterB{
	
	@Override
	public void method1() {
		System.out.println("method1 재정의!");
		
	}
	
	@Override
	public void method2() {
		System.out.println("method2 재정의!");
	}
	
	@Override
	public void method3() {
		System.out.println("method3 재정의!");
		
	}
}
