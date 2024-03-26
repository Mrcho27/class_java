package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

//		추가
		list.add(10);
		list.add(30);
		list.add(80);
		list.add(20);
		list.add(40);
		list.add(90);
		list.add(50);
		
		System.out.println(list);
		
//		Collections 클래스 : 컬렉션 프레임워크와 관련된 여러 기능을 가지고 있다.
//		static 메소드로 구현했기 때문에 객체를 만들 필요가 없다.
		
//		정렬
		Collections.sort(list); 
		System.out.println(list);
		
//		역정렬
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
//		섞기
		Collections.shuffle(list);
		System.out.println(list);
		
//		순서를 반대로 뒤집기(정렬 아님)
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		
		
	}
}




























