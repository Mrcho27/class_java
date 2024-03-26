package forTest;

public class Ex04 {
	public static void main(String[] args) {
//		1~100까지의 합을 구해라
		
//		int total = 0;
//		
//		for(int i =1; i<=100; i++) {
//			total += i;
//		}
//		
//		System.out.println(total);
//		
		
//		for(int i=0; i<10; i++) {
//			if(i==5) {
//				break; //위치에 따라서 결과가 바뀜
//			}
//			System.out.println(i);
//			
//		}
		
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//			
//			if(i == 3) {
//				continue;
//			}
//			
//		}
		
//		1~100까지 중 짝수의 합 출력 (continue를 활용하기)
		
		int total = 0;
		
		for(int i =1; i<=100; i++) {
			
			if(i % 2 !=0) {continue;}
			
			total += i;
		}
		
		System.out.println(total);
		
		
	}
}
























