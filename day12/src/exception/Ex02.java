package exception;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
//			try 블록에서 오류가 발생한다면
//			발생한 오류객체를 받을 수 있는 참조변수를 가진 catch문 영역이 실행된다.
			sc.next();
		} catch (NullPointerException e) {
			System.out.println("null이다!");
			
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e.toString());
		} catch(Exception e) {
//			우리가 try에서 어떤 오류가 발생할지 전부 예상하기는 힘들다.
//			예상치 못한 오류가 발생할 수도 있다.
//			예상치 못한 오류를 잡기위해 Exception타입의 참조변수를 사용한다.
//			모든 예외의 조상은 Exception클래스이다.
//			즉, 어떤 예외가 발생하더라도 Exception 타입의 참조변수에 저장가능하다.(업캐스팅)
			System.out.println("예상치 못한 오류");
		}
		
		System.out.println("실행 시키고 싶은 명령어~");
		
	}
}
