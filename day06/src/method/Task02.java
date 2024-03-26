package method;

public class Task02 {
	public static void main(String[] args) {
		System.out.println(changeNum(-9));
		printName("홍길동", 8);
		System.out.println(changeNum2(15));
		
		
		System.out.println(test(new int[] {3,4,7}));
	}
	
	
//	TODO 정수를 넘겨받아 음수면 양수로, 양수면 음수로 바꿔서 반환하는 메소드
	static int changeNum(int num) {
		
		return -1*num;
	}
//	TODO 이름과 정수를 넘겨받아 정수만큼 이름 출력하는 메소드
//				"홍길동",8 -> "홍길동" 8번 출력하기
	static void printName(String name, int num) {
		for(int i=0; i<num; i++) {
			System.out.println(name);
		}
	}
	
//	TODO 정수를 넘겨받아 10 이하의 숫자는 1로 10을 초과하는 숫자는 100으로 바꿔서 반환하는 메소드
	static int changeNum2(int num) {
		if(num<=10) {
			return 1;
		}else {
			return 100;
		}
		
	}
	
//	TODO 여러 정수를 넘겨받아 평균값을 반환하는 메소드
	static double test(int[] number) {
		int total=0;
		for(int i=0; i<number.length; i++) {
			total += number[i];
		}
		return (double)total/number.length;
	}
	
}














