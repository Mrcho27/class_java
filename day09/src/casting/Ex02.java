package casting;

class A{
	
}

class B extends A{
	
}

public class Ex02 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println( a instanceof A );//true
		System.out.println( a instanceof B );//false
		System.out.println( b instanceof B );//true
		System.out.println( b instanceof A );//true
		
		A var1 = new B();
		B var2 = new B();
		
//		B var1 = (B)new A();
	}
}
