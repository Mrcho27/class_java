package inter3;

class ClassA implements InterA{
	@Override
	public void method1() {
	}
}

public class Main {
	public static void main(String[] args) {
		InterA.method3();
		
		ClassA a =new ClassA();
		a.method2();
	}
}
