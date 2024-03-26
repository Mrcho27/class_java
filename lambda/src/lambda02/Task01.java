package lambda02;

/*
 * FuncInter3를 이용하여 다음 람다식을 만들고 실행한다.
 * -2개의 정수를 매개변수로 받아 곱한 결과를 반환하는 람다식
 * 
 * FuncInter4를 생성하고 다음 람다식을 실행한다.
 *  - 인터페이스에 2개의 문자열을 매개변수로 전다 받는 추상메소드 (combineString)을 선언한다.
 *  - 람다식으로 재정의하여 2개의 문자열을 연결하고 출력한다.
 */

public class Task01 {
	public static void main(String[] args) {

		FuncInter3 fi33 = (num1, num2) -> num1 * num2;

		int result2 = fi33.addNumber(3, 5);
		System.out.println(result2);
		
		
		
		
		FuncInter4 fi4 = (str1, str2) -> System.out.println (str1 + str2);
		
		fi4.combineString("안녕", "친구야");
	}
	
	
	
	

}
