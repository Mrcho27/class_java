package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
//		Stream의 최종 연산
		int[] ar = {3,5,6,1,2};
		
		List<Integer> list = List.of(3,5,6,1,2);
		
//		count() : 요소의 숫자를 세어준다.
		 long count = list.stream().count();
		 System.out.println(count);
		 
//		 sum() : 요소의 합을 구해준다.
		 int sum = list.stream().mapToInt(i->i).sum();
		 System.out.println(sum);
		 
		 System.out.println("========================");
		 
		 
//		 collect(Collectors.toList()) : 최종 반환을 리스트로 해준다. 박싱을 항상 주의한다.
		 List<Integer> myList = Arrays.stream(ar).boxed().collect(Collectors.toList());
		 myList.add(10);
		 System.out.println(myList);
		 
		 List<Integer> myList2 = Arrays.stream(ar).boxed().toList();
//		 myList2.add(10);
		 System.out.println(myList2);
		 
//		 Immutable : 불변하다.(불변성)
//		 mutable : 변할 수 있다.
		 
		 
		 Set<Integer> set = Arrays.stream(ar).boxed().collect(Collectors.toSet());
		 
		 Map<String, Integer> map = Arrays.stream(ar).boxed()
				 .collect(Collectors.toMap(i -> i+"번째", i->i*10));
		 
		 System.out.println(map);
		 
//		 toArray() : 최종 반환을 배열로 해준다.
		 
		 int[] myArr = list.stream().mapToInt(i->i).toArray();
		 
		 System.out.println(myArr);
		 
		 
		 
		 
	}
}
