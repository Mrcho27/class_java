package oper;

public class Ex03 {
	public static void main(String[] args) {
		
		System.out.println(true? 10 : 20);
		System.out.println(false? 10 : 20);
		
		int num = false ? 10 : 20;
		System.out.println(num);
		
		int num1 = 10, num2 =20;
		
		System.out.println(num1 == num2 ? 10 : 20);
		System.out.println(num1 == num2 ? "같다" : "다르다");
		
//		num1 이 num2보다 크니? 그러면 "크다"이고 아니면 "작다" 이다.
		System.out.println(num1 > num2 ? "크다" : "작다");
		
		num1 = 20;
		num2 = 20;
		System.out.println(num1 > num2 ? "크다" : num1 == num2 ? "같다" : "작다");
	}
}
