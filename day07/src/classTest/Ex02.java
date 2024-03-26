package classTest;

public class Ex02 {
	public static void main(String[] args) {
		Employee 사원1 = new Employee();
		사원1.name = "김철수";
		사원1.number = 1;
		사원1.career = 3;
		사원1.dept = "개발";
		
		Employee 사원2 = new Employee();
		사원2.name = "홍길동";
		사원2.number = 2;
		사원2.career = 1;
		사원2.dept = "영업";
		
		System.out.println(사원1.name);
		System.out.println(사원2.name);
		
		System.out.println(사원1);
		System.out.println(사원2);
		
	}
}
