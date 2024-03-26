package casting;

public class Ex01 {
	public static void main(String[] args) {
//		정수 -> 정수
		int num1 = (int)3L; // 강제 형변환
		long num2 = 3; // 자동 형변환
		
//		실수->실수
		float num3 = (float)3.0; //강제 형변환
		double num4 = 3.14F;
		
//		정수->실수
		float number1 = 12312L; // 자동 형변환
		double number2 = 3; // 자동 형변환
		
//		실수->정수
		int number3 = (int)3.9; //강제 형변환
		long number4 = (long)3.14F; //강제 형변환
		
		
		System.out.println(number3);
		
//		오버플로우
		byte n1 = 127;
		System.out.println((byte)(n1+1));
	}
}



















