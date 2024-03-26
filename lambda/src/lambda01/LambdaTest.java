package lambda01;

public class LambdaTest {
	void printHello() {
		System.out.println("안녕하세요");
	}
	
	/* void printHello() {System.out.println("안녕하세요");}
	 * void () -> {System.out.println("안녕하세요");} //이름을 없애고 ->를 추가한다.
	 * () -> {System.out.println("안녕하세요");} 		//반환타입은 추론이 가능하므로 생략
	 * () -> System.out.println("안녕하세요")				 //명령문이 1줄이면 중괄호를 생략 가능
	 * 	                                                                 // 중괄호를 생략하면 ;도 생략해야한다.
	 * 
	 */
	
	int add10(int number) {
		return number +10;
	}
	
	/*
	 * int add10(int number) {return number +10;}
	 * int (int number) -> {return number +10;}	//이름을 없애고 -> 를 추가한다.
	 * (int number) -> {return number +10;}		//반환타입은 추론이 가능하므로 생략
	 * (number) -> {return number +10;}	  	 //매개변수 타입은 추론이 가능하므로 생략
	 * number -> {return number +10;}		  	 //매개변수가 1개라면 ()를 생략 가능
		 * number -> number +10	                 // 중괄호와 세미콜론을 생략 가능
		 *                                                     // 생략하면 return 생략해야 한다.
	 *                                                     		// 바디의 결과가 값이면 자동으로 return된다.
	 *                                                     	   // 단, 명령문이 1개 이어야만 가능하다.
	 */
	
	int addNumber(int num1, int num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1 +num2));
		return num1 + num2;
	}
	
	/*
	 * (num1, num2) -> {
	 * 		System.out.println(num1 + "+" + num2 + "=" + (num1 +num2));
			return num1 + num2;
			}
	 * 매개변수가 2개 이상이므로 () 생략불가
	 * 명령어가 2개 이상이므로 {}와 ; 생략불가ㅣ
	 * {}와 ;을 생략하지 않았으므로 return할 값이 있다면 return을 명시해야한다.
	 */
	
	
	
	
	
	
	
	
	
}
