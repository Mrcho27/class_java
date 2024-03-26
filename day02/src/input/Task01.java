package input;

import java.util.Scanner;

/*
 * 두 정수를 입력받고 합을 출력하기
 * 
 * 입력)
 * 정수 1 입력 : 20
 * 정수 2 입력 : 40
 * 
 * 출력)
 * 두 정수의 합은 60 입니다.
 */
public class Task01 {
	public static void main(String[] args) {
		/*
		 * 기본값
		 * int : 0
		 * double : 0.0
		 * char : ' '
		 * boolean : false
		 * String : "", null
		 */
		Scanner sc = new Scanner(System.in);
		
//		int num1 = 0;
//		int num2 = 0;
//		System.out.print("정수 1 입력 : ");
//		num1 =sc.nextInt();
//		System.out.print("정수 2 입력 : ");
//		num2 = sc.nextInt();
//		
//		System.out.println("두 정수의 합은 "+(num1+num2)+"입니다.");
		String num1 = "", num2 = "";
		int number1 = 0, number2 = 0;
		
		System.out.print("정수1 입력 : ");
	    num1 = sc.next();
	    System.out.print("정수2 입력 : ");
	    num2 = sc.next();
	      
	    number1 = Integer.parseInt(num1);
	    number2 = Integer.parseInt(num2);
	      
	    System.out.println("두 정수의 합은 " + (number1 + number2) + "입니다.");

	}
}
