package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * stream의 메소드는 중간 연산과 최종 연산으로 나뉜다.
		 * forEach()는 최종 연산 메소드 이다.
		 */
		
//		map() : 각 요소를 변환하다. (연산)
		IntStream.range(0, 5).map(i -> i+10).forEach(i->System.out.println(i));
		
//		sorted() : 정렬한다.
		int[] ar = {6,2,4,8,3,5};
		Arrays.stream(ar).sorted().forEach(i->System.out.println(i));
		
		System.out.println("=========================");
		
//		boxed() : 박싱
//		sorted(Collections.reverseOrder()) : 역정렬, 단 일반 자료형은 박싱이 필요하다.
		
		Arrays.stream(ar)
			.boxed()
			.sorted(Collections.reverseOrder())
			.forEach(i->System.out.println(i));
		
		System.out.println("=============================");
		List<Integer> list = List.of(1,1,2,2,3,3);
		
//		distinct() : 중복을 제거한다.
		list.stream().distinct().forEach(i -> System.out.println(i));
		
//		mapToInt() : 요소를 기본자료형 int로 변환한다. (언박싱)
		list.stream().mapToInt(i -> i+10).forEach(i -> System.out.println(i));
		
		System.out.println("=============================");
		
//		filter() : 요소를 조건에 맞게 걸러낸다.
		list.stream().filter(i -> i%2==0).forEach(i-> System.out.println(i));
		
		System.out.println("=============================");
		
//		list를 활용하여 다음 흐름을 만든다.
//		중복제거 -> 요소 걸러내기(짝수만) ->각각 출력하기
		list.stream().distinct().filter(i-> i%2==0).forEach(i->System.out.println(i));
		
	}
}





























