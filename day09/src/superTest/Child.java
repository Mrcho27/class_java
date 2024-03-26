package superTest;

public class Child extends Parents{
	int data;
	
	public Child() {
		System.out.println("child 생성자 호출");
	}

	public Child(int data) {
		super();
		this.data = data;
	}
	
}
