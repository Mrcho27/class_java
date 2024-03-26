package oper;
/*
 * 두 자릿수 정수를 입력 받고 십의 자리, 일의 자리를 출력하는 프로그램 만들기
 * 
 * 입력)
 * 두자릿수 정수를 입력하세요 : 51
 * 
 * 출력)
 * 십의 자리는 5입니다.
 * 일의 자리는 1입니다.
 */

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0, result1 =0, result2 = 0;
		
		System.out.println("두 자릿수 정수를 입력하세요 : ");
		inputNum = sc.nextInt();
		
		result1 = inputNum /10;
		result2 = inputNum %10;
		
		System.out.println("십의 자리 : " + result1);
		System.out.println("일의 자리 : " + result2);
	}
}
