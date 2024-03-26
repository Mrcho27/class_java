package array;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arPw = new int[5];
		String result = null;
		int choice = 0, inputPw=0;
		
//		TODO 1. 5칸 짜리 사물함의 비밀번호를 가각 배열에 저장한다.
		for(int i=0; i<arPw.length; i++) {
			System.out.print(i+1 + "번 사물함 비밀번호 설정 >>");
			arPw[i] = sc.nextInt();
		}
//		TODO 2. 사용자에게 이용할 사물함 번호를 묻는다.
		System.out.println("이용할 사물함 번호를 입력>>");
		choice = sc.nextInt();
		
//		TODO 3. 비밀번호를 입력받아 확인한다.
		System.out.print("비밀번호를 입력하세요>>");
		inputPw = sc.nextInt();
		
//		TODO 4. 일치/불일치를 출력한다.
		if(arPw[choice - 1] == inputPw) {
			result = "비밀번호가 일치합니다.";
		}else {
			result = "비밀번호가 일치하지 않습니다.";
		}
		System.out.println(result);
	}
}
