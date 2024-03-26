package array;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
//		5개의 정수를 입력한 뒤 배열에 담고 최대값과 최소값 출력
		Scanner sc = new Scanner(System.in);
		int[] arr4 = new int[5];
		int min = 0, max=0;
	
		for(int i=0; i<arr4.length; i++) {
			System.out.print(i +1 +"번쨰 정수입력 >>");
			arr4[i] = sc.nextInt();
		}
		max = arr4[0];
		min = arr4[0];
		
		for(int i =1; i<arr4.length; i++) {
			if(max < arr4[i]) {max = arr4[i];}
			if(min > arr4[i]) {min = arr4[i];}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
