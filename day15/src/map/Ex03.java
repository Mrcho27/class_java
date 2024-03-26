package map;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		
		Map<String,Integer> practice= new HashMap<String, Integer>();
		
		practice.put("김철수", 1);
		practice.put("신짱구", 20);
		
		System.out.println(practice);
		
		System.out.println(practice.get("김철수"));
		System.out.println(practice.values());
		System.out.println(practice.size());
	}
}
