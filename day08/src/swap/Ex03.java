package swap;

class A{
	int data;
}

public class Ex03 {
	public static void main(String[] args) {
		A myA = createA();
		
		System.out.println(myA.data);
	}
	
	static A createA() {
		A a = new A();
		a.data =10;
		return a;
	}
}
