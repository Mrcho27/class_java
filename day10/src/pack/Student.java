package pack;

public class Student implements Person{

	@Override
	public void walk() {
		System.out.println("걷기");
		
	}

	@Override
	public void run() {
		System.out.println("뛰어가기");
		
	}

	@Override
	public void eat() {
		System.out.println("먹기");
		
	}
	
}
