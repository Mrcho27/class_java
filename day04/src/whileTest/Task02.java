package whileTest;

import java.util.Scanner;

//양의 정수를 입력받는다.
//7씩 빼서 -10 이하로 떨어지는 수를 만들려면
//얼마나 반복 해야하는지 구하는 프로그램을 만들기
//
//입력 )
//양의 정수 입력 >> 10
//
//출력 )
//3

public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0, count = 0;
		
		System.out.print("양의 정수 입력 >>");
		number = sc.nextInt();
		
		while(number > -10) {
			number -=7;
			count++;
		}
		
//		while(true) {
//			number -= 7;
//			count++;
//			if(number <= -10) {break;}
//		}
		System.out.println(count);
		
}
}
