package oper;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0, count = 0, change = 0;
		final int COIN = 300;
		
		System.out.print("금액 입력 : ");
		money = sc.nextInt();
		
		count = money/COIN;
		change = money%COIN;
		
		System.out.println(count + "곡을 부를 수 있으며 잔돈은 "+change + "원 입니다.");
		
	}
}
