package toString;

class Student{
	int math;
	int kor;
	int eng;
	String grade;
	
	
	
	public Student(int math, int kor, int eng, String grade) {
		super();
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		this.grade = grade;
	}
	


	@Override
	public String toString() {
		return "Student [math=" + math + ", kor=" + kor + ", eng=" + eng + ", grade=" + grade + "]";
	}

	

	
}

public class Ex03 {
	public static void main(String[] args) {
		Student s1 = new Student(100,90,78,"B");
		
		
		
		System.out.println(s1);
	}
}

