package stream;

import java.util.stream.IntStream;

public class Ex02 {
	public static void main(String[] args) {
		IntStream is = IntStream.range(0, 5);
		
		
//		요소가 넘어오는 방식 : 각각의 요소를 하나씩 매개변수 i로 받는다.
		is.forEach(i -> System.out.println(i));
		
//		스트림은 1회성이기 때문에 재사용이 불가능하다.
//		is.forEach(i -> System.out.println(i));
		
//		그러므로 특별한 상황이 아니라면 변수에 담을 필요가 없다.
		IntStream.range(0, 5).forEach(i -> System.out.println(i));
		
		
		
		
	}
}
