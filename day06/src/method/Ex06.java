package method;

public class Ex06 {
	public static void main(String[] args) {
		int number =myMethod();
		System.out.println(number);
	}
	
	static int myMethod() {
		int result = test();
		return result;
	}
	
	static int test() {
		return 10;
	}
	
	
}
