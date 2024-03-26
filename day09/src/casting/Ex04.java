package casting;

class ClassA extends Object{
	int data;

	public ClassA(int data) {
		super();
		this.data = data;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		ClassA a = new ClassA(3);
		
		Object obj = new ClassA(3);
		
	}	
}
