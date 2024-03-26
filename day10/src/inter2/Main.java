package inter2;

public class Main {
	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		
		b.method1();
		b.method2();
		b.method3();
		
		
		
		ClassA a = new ClassB();
		InterA ia = new ClassB();
		InterB ib = new ClassB();
		InterC ic = new ClassB();
		
		ia.method1();
		ib.method2();
		ic.method3();
		
		
		
	}
}
