package switchTest;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		String result = "";
		
		System.out.print("1부터 4까지 정수를 입력하세요>>");
		number = sc.nextInt();
		
		switch(number) {
		case 1, 3:
			result = "홀수";
			break;
		case 2, 4:
			result = "짝수";
			break;
		
		default :
			result = "잘못 입력함!";
		}
		
		System.out.println(result);
		
	}
}
