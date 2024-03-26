package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 >>");
		String name = sc.nextLine();
		System.out.println(name + "님 안녕하세요");
	}
}
