package casting;

public class Ex03 {
	public static void main(String[] args) {
//		문자열의 형변환
		int num1 = 10, num2 = 20;
		String number1 = "10", number2 = "20";
		
		System.out.println(num1 + num2);	//연산
		System.out.println(number1 + number2); //문자열은 연결
		
		System.out.println(num1 + number2);
		
		System.out.printf("제 나이는 %d살입니다.",num1);
		System.out.println("제 나이는" + num1 + "살입니다.");
		
		String a = "숫자1 : " + num1; // 연결의 결과는 무조건 문자열이다.
		
		System.out.println("두 수의 합은 "+(num1 + num2) + "입니다.");
		
		String number3 = 30 + "";
	}
}
