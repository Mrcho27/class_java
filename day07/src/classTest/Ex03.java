package classTest;

public class Ex03 {
	public static void main(String[] args) {
		Student s1 = new Student();// 생성자
		s1.kor =20;
		s1.eng =40;
		s1.math =70;
		
//		printTotal(s1.kor, s1.eng, s1.math);
		s1.printTotal();
		
	}
	
	
}
