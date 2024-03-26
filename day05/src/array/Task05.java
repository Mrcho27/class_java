package array;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		//입력 횟수 n을 입력받는다.
		//n개의 정수를 추가로 입력받는다.
		//기준 숫자 k를 입력받는다.
		//n개의 정수 중 k보다 작은 수가  몇 개 있는지 출력한다.
		//
		//입력 )
		//입력 횟수 >> 10
		//10개의 정수 입력 >> 1 3 1 2 3 5 9 7 7 3
		//기준 정수 >> 7
		// 
		//출력 )
		//7보다 작은 수는 총 7개 있습니다.
		Scanner sc = new Scanner(System.in);
		int[] arData = null;
		int number=0, target=0, cnt=0;
		
		System.out.print("입력 횟수 >> ");
		number = sc.nextInt();
		
		arData = new int[number];
		
		System.out.print(number + "개의 정수 입력");
		
		for(int i=0; i<number; i++) {
			arData[i] = sc.nextInt();
		}
		
		System.out.print("기준 정수 >> ");
		target =sc.nextInt();
		
		for(int i=0; i<number; i++) {
			if(arData[i] < target) {cnt ++;}
		}
			
		System.out.println(target + "보다 작은 수는 총" + cnt + "개 있습니다.");
	}

}






















