package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task01 {
	public static void main(String[] args) {
		printLottoNum(5);
		
	}
	
	public static void printLottoNum(int line) {
		Random r = new Random();
		Set<Integer> lottoSet = new HashSet<Integer>();
		List<Integer> result = null;
		
		
		for (int i = 0; i < line; i++) {
			lottoSet.clear();
			
			while (lottoSet.size() < 6) {
				lottoSet.add(r.nextInt(45) + 1);
			}
			result = new ArrayList<Integer>(lottoSet);
			Collections.sort(result);
			System.out.println(result);
			
		}
		
		
		
	}
}
