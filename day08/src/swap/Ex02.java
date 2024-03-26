package swap;

class Student{
	int math;
	int eng;
	int kor;
}

public class Ex02 {
	public static void main(String[] args) {
		int[] ar= {1,2,3};
		int[] ar2 = ar;
		
		ar[1] = 100;
		
		System.out.println(ar2[1]);
		
		Student s1 = new Student();
		Student s2 = s1;
		
		s2.math =100;
		
		System.out.println(s1.math);
		
		
	}
}
