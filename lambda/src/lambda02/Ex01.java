package lambda02;

public class Ex01 {
	public static void main(String[] args) {

		FuncInter1 fi = () -> System.out.println("안녕");

		fi.method();

		FuncInter2 fi2 = number -> number + 10;

		int result = fi2.add10(20);
		System.out.println(result);

		FuncInter3 fi3 = (num1, num2) -> {
			System.out.println("더한다!");
			return num1 + num2;
		};
		
		int result2 = fi3.addNumber(10, 100);
		
		System.out.println(result2);
	}
}
