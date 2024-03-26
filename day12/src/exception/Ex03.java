package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int a =10, b =0;
		
		try {
			method1(10,0);
		} catch (Exception e) {
			System.out.println("0은 안돼요!");
		}
		
	}
	
	
	static void method1(int a, int b) {
		System.out.println(a/b);
		
	}
}
