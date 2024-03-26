package input;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String animal = "";
		int number = 0;
		
		System.out.print("좋아하는 숫자 >>");
		number = sc.nextInt();
		sc.nextLine(); //엔터 소모용
		System.out.print("좋아하는 동물 >>");
		animal = sc.nextLine();
		
		System.out.println("내가 좋아하는 숫자는 "+ number + "이다.");
		System.out.println("내가 좋아하는 동물은 "+ animal + "이다.");
	}
}
