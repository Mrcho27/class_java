package method;

public class Task01 {
	public static void main(String[] args) {
		printName("홍길동");
		System.out.println(getTotal());
		
		int[] arData = {1,2,3,4,5};
		int result = getTotalOfArray(arData);
		System.out.println(result);
		
		getTotalOfArray(new int[] {3,4,5,6,7});
		
		printTotal(10);
	}
	
//	TODO 이름을 넘겨받아 "1. ~님 안녕하세요" ...."5. ~님 안녕하세요" 출력하는 메서드
	static void printName(String name) {
		for(int i=0;i<5; i++) {
			System.out.println(i+1+"."+name +" 님 안녕하세요");
		}
	}
	
	
//	TODO 1~100까지의 합을 반환하는 메소드
	static int getTotal() {
		int total=0;
		for(int i=0; i<=100; i++) {
			total+= i;
		}
		return total;
	}
//	TODO 여러 정수를 넘겨주면 합을 반환하는 메소드(5개의 정수)
	static int getTotalOfArray(int[] numbers) {
		int total = 0;
		
		for(int i=0; i<numbers.length; i++) {
			total += numbers[i];
		}
		
		return total;
	}
//	TODO 정수 num을 전달 받아 1~num까지의 합을 출력하는 메소드
	static void printTotal(int num) {
		int total = 0;
		
		for(int i=0; i<num; i++) {
			total += i+1;
		}
		
		System.out.println("1부터 " + num + " 까지의 합>> " + total);
	}


	
	
}

















