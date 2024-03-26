package lambda03;

import java.util.Comparator;

import lambda02.FuncInter2;

public class Ex01 {
	public static void main(String[] args) {
		Comparator<Integer> c = (num1, num2) -> num1 * num2;
			
		System.out.println(c.compare(10, 11));
		
//		FuncInter2 fi2 = num -> num  +10;
//		
//		System.out.println(fi2);
		
		int result = method1(i -> i*10);
		
		System.out.println(result);
		
		FuncInter2 fi22 = method2();
		int result2 = fi22.add10(100);
		System.out.println(result2);
	}
	
	static int method1(FuncInter2 fi2) {
		return fi2.add10(10);
	}
	
	static FuncInter2 method2() {
		return n -> n * 10;
	}
}
