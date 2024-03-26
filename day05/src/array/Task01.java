package array;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
//		100~1까지의 값 배열에 넣고 출력하기
		int[] arr = new int[100];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length-i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("============================");
		
//		1~10까지 값을 배열에 넣고 총 합 구하기
		int[] arr2 = new int[10];
		int sum= 0;
		
		for(int i =0; i<arr2.length; i++) {
			arr2[i] = i+1;
		}
		
		for(int i =0; i<arr2.length; i++) {
			sum += arr2[i];
		}
		System.out.println(sum);
		
//		3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수 출력하기
		Scanner sc = new Scanner(System.in);
		int[] arr3 = new int[3];
		int total = 0;
		
		//TODO 1.3명의 수학점수를 반복문으로 입력받는다.
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(i+1 +"번 학생의 수학점수 >>");
			arr3[i] = sc.nextInt();
		}
		
		//TODO 2. 전체 총합을 구한다.
		for(int i = 0; i<arr3.length; i++) {
			total += arr3[i];
		}
		//TODO 3. 평균점수를 출력한다.
		System.out.println("평균 >>"+ (double)total/arr3.length);
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
