package casting;

public class Ex04 {
	public static void main(String[] args) {
//		자바 자료형 대분류
//		int, double, char, boolean... -> 앞글자가 소문자, 기본 자료형, 원시 자료형, primitive type
//		String, 클래스... -> 앞글자가 대문자, 클래스 자료형, *참조 자료형, reference type
		
//		기본 자료형 -> String
		String str1 =3 + "";
		String str2 = 3.14+ "";
		String str3 = 'a' + "";
		String str4 = true + "";
		
//		String -> 기본 자료형
//		기본 자료형은 기본 자료형끼리 형변환이 된다.
//		클래스 타입은 기본 자료형으로 형변환이 불가능하다.
//		그러나 문자열은 특별한 자료형이라서 Integer, Double 등의 클래스의 도움을 받으면
//		형변환이 가능하다.
		
		int number1 = Integer.parseInt(str1); // parse : 분석
		double number3 = Double.parseDouble(str2);
		boolean isTrue = Boolean.parseBoolean(str4);

	}
}
