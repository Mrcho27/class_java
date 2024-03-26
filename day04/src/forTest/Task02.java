package forTest;

import java.util.Scanner;

/*
 * 두 수의 곱을 구하기
 * 반복할 숫자를 입력받고
 * 두 수를 입력하여 곱을 구한다.
 * 
 * 입력)
 * 반복 수 >> 3
 * 
 * 곱할 수 >> 5 3
 * 출력 : 15
 * 
 * 곱할 수 >> 2 3
 * 출력 : 6
 * 
 * 곱할 수 >> 1 3
 * 출력 : 3
 */
public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chance =0, num1 =0, num2 =0;
	
		System.out.print("반복 수 >> ");
		chance = sc.nextInt();
		
		for(int i = 0; i<chance; i++) {
			System.out.print("곱할 수 >>" );
			num1 = sc.nextInt();
			System.out.print("곱할 수 >>" );
			num2 = sc.nextInt();
			
			System.out.println(num1 * num2);
			
		}
		
	}
}
