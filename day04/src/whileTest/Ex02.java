package whileTest;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0;
		String msg = "1. 빅맥\n"
				+ "2. 상하이\n"
				+ "3. 종료\n"
				+ "입력>>";
		
		while(true) {
			System.out.println("어서오세요~");
			System.out.println(msg);
			choice = sc.nextInt();
			
			if(choice ==3) {break;}
		}
		
	}
}
