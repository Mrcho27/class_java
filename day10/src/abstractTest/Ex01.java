package abstractTest;

abstract class ClassA{
	abstract void method1();
	
	void method2() {
		System.out.println("메소드2 실행!!!");
	}
}

class ClassB extends ClassA{
	
	@Override
	void method1() {
		System.out.println("오버라이딩 method1 ");
	}
}

public class Ex01 {
	public static void main(String[] args) {
//		ClassA a = new ClassA();
		
		ClassB b = new ClassB();
		
		b.method1();
		b.method2();
		
		ClassA a = new ClassB(); //업캐스팅
		
		a.method1();
		a.method2();
		
		
	}
}
