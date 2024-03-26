package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		List<Integer> list = makeList();
		List<String> viewList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int tmp = 0,flag=0,count=0,idx=0;
		
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
	
	
	static List<Integer> makeList() {
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		int tmp=0;
		
		while(list.size()<5) {
			tmp = r.nextInt(20) +1;
			
			if(!list.contains(tmp)) {
				list.add(tmp);
			}	
		}
		
		Collections.sort(list);
		
		return list;
	}
	
	
}

