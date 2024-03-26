package ifTest;

import java.util.Scanner;

/*
 * 사용자에게 시험 점수를 입력받는다.
 * 90점 이상은 A
 * 70점 이상은 B
 * 50점 이상은 C
 * 나머지는 F를 출력한다.
 * 
 * 입력)
 * 점수 입력 >>90
 * 
 * 출력)
 * 학점은 'A'입니다.
 */

public class Task03 {
	public static void main(String[] args) {
//		1. 사용자에게 점수를 입력받는다.
//		2. 점수를 확인해서 학점을 구한다.
//		3. 구한 학점을 출력한다.
		Scanner sc = new Scanner(System.in);
		int point = 0;
		
		
		String result = "";
		String msg = "잘못된 점수 입니다.";
		
		System.out.println("점수 입력 >>");
		point = sc.nextInt();
		if(point <=100 && point >= 90) {
			result ="'A'";
		}else if(point >=70 ) {
			result ="'B'";
		}else if(point >=50) {
			result = "'C'";
		}else if(point <50){
			result = "'F'";
		}else {
			result =msg;
		}
		System.out.println("내 학점은 "+ result + "입니다.");
	}
}
