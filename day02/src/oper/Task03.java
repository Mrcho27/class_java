package oper;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0 , num2=0; 
		String result = "";
		
		System.out.print("정수 1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		num2 = sc.nextInt();
		
		result = num1 > num2 ? "큰 수 : "+num1 : 
			num1==num2 ? "두 수는 같습니다." :"큰 수 : " +num2;
		
		
		
		System.out.println(result);
				
	}
}
