package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 1~20까지의 난수를 만들어 ArrayList에 5개만 저장한다.
 * 1.중복되는 수는 없도록 한다.
 * 2.정렬한다.
 */
public class Task01 {
	public static void main(String[] args) {
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
		
		System.out.println(list);
		
		
	}
}
