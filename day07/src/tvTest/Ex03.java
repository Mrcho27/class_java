package tvTest;

class ClassA{
	int data;
	
	public ClassA(int data) {
		this.data =data;
	}
	
	void printThis() {
		System.out.println(this);
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		ClassA a = new ClassA(100);
		System.out.println(a.data);
		
		a.data = 10;
		
		System.out.println(a.data);
		System.out.println(a);
		a.printThis();
	}
}
