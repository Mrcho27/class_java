package oper;

import java.util.Scanner;

/*
 * 다음 중 음식이 아닌 것은?
 * 1.피자
 * 2.케이크
 * 3.불고기
 * 4.JAVA
 * 
 * 
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String quizMsg = "다음 중 음식이 아닌것은?\n"
				+ "1.피자\n"
				+ "2.케이크\n"
				+ "3.불고기\n"
				+ "4.JAVA\n"
				+ "입력>>";
		
		int choice = 0;
		String resultMsg = "";
		
		
		System.out.println(quizMsg);
		choice = sc.nextInt();
		
		resultMsg = choice == 4 ? "정답" :
			choice>=1 && choice <=4 ? "오답" : "잘못입력했습니다.";
		
		System.out.println(resultMsg);
		
		
		
	}
}
