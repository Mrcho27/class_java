package oper;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0 , num2=0, result = 0;
		
		System.out.print("정수 1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		num2 = sc.nextInt();
		
		result = num1 > num2 ? num1 : num2;
		
		System.out.println("큰 수는"+ result + "입니다.");
				
	}
}
