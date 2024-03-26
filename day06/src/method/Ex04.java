package method;

public class Ex04 {
	public static void main(String[] args) {
		
		checkNumber(0);
		
	}
	
	static void checkNumber(int number) {
		System.out.println("1번");
		
		if(number==0) {
			return;
		}
		
		System.out.println("2번");
		System.out.println("3번");
	}
	
	
}
