package whileTest;

import java.util.Scanner;

/*
 * 두 수의 곱을 구한다.
 * 
 * 두 수 중에 하나라도 음수면 반복이 종료된다.
 * 
 *  예시) 
 *  두 수 입력 >> 2 3
 *  출력) 6
 *  
 *  두 수 입력 >> 5 6
 *  출력) 30
 *  
 *  두 수 입력 >> -1 3
 *  
 *  **종료**
 */



public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2=0;
		
		while(true) {
			System.out.print("두 수 입력 >>");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if(num1<0 || num2<0) {
				System.out.println("**종료**");
				break;
			}
			
			System.out.println(num1 * num2);
		}
		
		
	}
}





























