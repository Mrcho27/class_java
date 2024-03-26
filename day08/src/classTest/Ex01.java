package classTest;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Tv tv1 = new Tv(1,1,false,"Black");
		
		Scanner sc = new Scanner(System.in);
		String msg ="""
				1. 전원 버튼
				2. 채널 올리기
				3. 채널 내리기
				입력>>
				""";
		
		int choice = 0;
		
//		alt +shift +z
		while (true) {
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(tv1.power) {
					System.out.println("전원 끄기!");
				}else {
					System.out.println("전원 켜기!");
				}
				tv1.powerOnOff();
				break;
			case 2:
				if(tv1.power) {
					System.out.println("채널 : " + tv1.chUp());
				}
				break;
			case 3:
				if(tv1.power && tv1.ch >1) {
					System.out.println("채널 : " + tv1.chDown());
				}
				break;
			default :
				System.out.println("잘못 입력함!");
			}
		}
		
		
	}
}
