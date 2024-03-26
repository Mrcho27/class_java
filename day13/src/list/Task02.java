package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * list에 값을 5개 저장하고 정렬한다.(1~20까지의 정수만 사용)
 * 사용자가 list에 저장된 값을 맞추는 프로그램을 짠다.
 */
public class Task02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<String> viewList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int tmp = 0,flag=0,count=0,idx=0;
		
		list.add(11);
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(27);
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			viewList.add("?");
		}
		
		while(flag<5) {
			System.out.println(viewList);
			System.out.println("정수를 입력하세요(1~20)>>");
			tmp = sc.nextInt();
			count ++;
			
			if(list.contains(tmp)) {
				System.out.println("맞췄습니다.");
				
				idx =list.indexOf(tmp);
				viewList.set(idx, tmp+"");
				
				list.set(idx,Integer.MIN_VALUE);
				
				flag++;
				
			}else {
				System.out.println("틀렸습니다.");
			}
			
			System.out.println();
		}
		
		System.out.println("======================");
		System.out.println("축하합니다");
		System.out.println(count +"번 시도하였습니다.");
	}
}


















