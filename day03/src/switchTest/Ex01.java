package switchTest;

public class Ex01 {
	public static void main(String[] args) {
		int num1 = 5;
		
		switch(num1) {
		case 1:
			System.out.println("1이다!");
			break;
		case 2:
			System.out.println("2다!");
			break;
		case 10:
			System.out.println("10이다!");
			break;
		default :
			System.out.println("일치 안한다!");	
			break;
		}
	}
}
