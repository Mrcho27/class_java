package ifTest;

public class Ex06 {
	public static void main(String[] args) {
		int num1 = 10, num2 =20;
		
//		if(num1 < num2) {
//			System.out.println("1번");
//		}else if (num1 != num2) {
//			System.out.println("2번");
//		}else {
//			System.out.println("3번");
//		}
		
		
		if(num1 > num2) {
			System.out.println("1번");
		}else if (num1 == num2) {
			System.out.println("2번");
		}else if(num1 != 10){
			System.out.println("3번");
		}else if(num2 != 20) {
			System.out.println("4번");
		}else {
			System.out.println("5번");
		}
			
		
	}
}
