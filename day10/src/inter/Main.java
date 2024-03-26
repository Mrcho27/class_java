package inter;

public class Main {
	public static void main(String[] args) {
//		Inter inter = new Inter();
		
		ClassA a = new ClassA();
		
		a.method1();
		a.method2();
		
		Inter inter = new ClassA();
		inter.method1();
		inter.method2();
		
		System.out.println(Inter.VAR1);
		System.out.println(ClassA.VAR1);
	}
}
