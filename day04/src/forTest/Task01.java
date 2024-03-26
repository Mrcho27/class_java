package forTest;

public class Task01 {
	public static void main(String[] args) {
//		1 ~100까지 출력
		
//		100~1까지 출력
		
//		1~100까지 중 짝수만 출력
		
//		구구단 3단 출력 
//		3 x 1 =3
//		3 x 2 = 6
//		....
//		3 x 9 = 27
		
//		A~F 출력
		
//		aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
//		a== 97 , b ==98
//		A== 65, B ==66
		
		
		for(int i =0; i<100; i++) {
			System.out.println(i + 1);
		}
		
		System.out.println("===================================");
		
		for(int i =0; i<100; i++) {
			System.out.println(100 - i);
		}
		
		System.out.println("===================================");
		
		for(int i =0; i<50;  i ++ ) {
			System.out.println((i+1)*2);
		}
		
		System.out.println("===================================");

		for(int i =1; i<10; i++) {
			System.out.println("3 X "+i+"="+ i*3);
		}
		
		System.out.println("===================================");
		
		for(int i =0; i<6; i++) {
			System.out.println((char)('A'+i));
		}
		
		System.out.println("===================================");
		
		for(int i =0; i<26; i++) {
			if( i % 2 == 0) {
				System.out.print((char)('a'+i));
			}else {
				System.out.print((char)('A'+i));
			}
		}
		
		System.out.println();
		
		for(int i =0; i<26; i++) {
			System.out.print((char)(i%2==0 ? 'a'+i : 'A'+i));
		}
		
	}
}




















