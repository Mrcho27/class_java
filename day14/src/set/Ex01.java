package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Set<String> animalSet = new HashSet<>();
		
		animalSet.add("원숭이");
		animalSet.add("양");
		animalSet.add("쥐");
		animalSet.add("기린");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("하마");
		
		System.out.println(animalSet.toString());
		
		Iterator<String> animalIter = animalSet.iterator();
		
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.next());
		
		while(animalIter.hasNext()) {
			System.out.println(animalIter.next());
		}
		
		
	}
}
