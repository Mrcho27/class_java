package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {
//		스트림 생성
		
//		범위를 이용한 생성
		IntStream is = IntStream.range(0, 5);	// 0~4
		IntStream is2 = IntStream.rangeClosed(0, 5);	//0~5
		
//		Arrays를 사용한 생성
		int[] ar = {1,2,3,4,5};
		IntStream is3 = Arrays.stream(ar);
		
//		Collection을 사용한 Stream<T> 생성
		List<Integer> list = new ArrayList<>();
		Stream<Integer> s1 = list.stream();
		
		List<String> list2 = new ArrayList<String>();
		Stream<String> s2 = list2.stream();
		
		Set<Integer> set = new HashSet<>();
		Stream<Integer> s3 = set.stream();
		
		Map<String, Integer> map  = new HashMap<String, Integer>();
		
//		map 자체로 stream을 만들 수는 없다.
//		map.stream();
		 Stream<String> s4 = map.keySet().stream();
		 Stream<Integer> s5 = map.values().stream();
		
		 
	}
}






















