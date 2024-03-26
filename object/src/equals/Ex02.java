package equals;



class Student{
	int num;
	String name;
	
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	
		@Override
		public boolean equals(Object obj) {
//			s1.equals(s2)
			int myNumber =this.num;
			int otherNumber =((Student)obj).num;
					
			return myNumber == otherNumber;
		}
		
		
	}
	


public class Ex02 {
	public static void main(String[] args) {
		Student s1 = new Student(1,"김철수");
		Student s2 = new Student(1,"김철수");
		Student s3 = new Student(3,"홍길동");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}
}




