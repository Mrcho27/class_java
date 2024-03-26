package list;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		
//		al.add(3);
//		al.add(4.5);
//		al.add("Hi");
//		
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//		
		
//		<Integer> : 제네릭
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
//		list.add("Hi");
		
		for(int i=0; i<10; i++) {
			list.add(i+10);
		}
		
		System.out.println(list.size());
		
//		빠른 for문, forEach문
//		index번호가 필요없다.
		
		for(Integer data : list) {
			System.out.println(data);
		}
		
		int[] ar = {1,2,3,4,5};
		
		for(int data :ar) {
			System.out.println(data);
		}
		
		
//		ArrayList는 toString()이 재정의 되어있다.
		System.out.println(list);
		
		
		
		
		
		
	}
}
