package print;

public class Ex02 {
	public static void main(String[] args) {
		int age = 10;
		
		System.out.printf("제 나이는 %d살입니다.\n",age);
		System.out.printf("내 평균 점수는 %f점 입니다.\n", 88.123);
		System.out.printf("제 학점은 %c입니다.\n",'A');
		
		System.out.printf("내 평균 점수는 %.2f점 입니다.\n", 88.123);
		System.out.printf("제 나이는 %010d살입니다.\n",age);
	}
}
