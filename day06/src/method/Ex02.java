package method;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("안녕~~");
		
		inputAndPrint();
		
		System.out.println("안녕~~");
		
		inputAndPrint();
		
		System.out.println("안녕~~");
		
		
		
	}
	
	static void inputAndPrint() {
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		
		System.out.print("5개 정수 입력 >> ");
		for(int i=0; i<arData.length; i++) {
			arData[i] = sc.nextInt();
		}
		
		for(int i= 0; i<arData.length; i++) {
			System.out.println(arData[i]);
		}
	}
}
