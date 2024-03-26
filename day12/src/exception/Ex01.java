package exception;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("1번");
		System.out.println("2번");
		
		try {
			System.out.println(10/0);
		}catch(NullPointerException e) {
			System.out.println("예외가 발생됨");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨!");
		}
		
		
		
		
		System.out.println("3번");
		System.out.println("4번");
	}
}
