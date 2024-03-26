package classTest;

public class Student {
	String name;
	String grade;
	int math;
	int kor;
	int eng;
	
	void printTotal() {
		int total = kor + eng +math;
		System.out.println("총 합 >>" + total);
	}
}
