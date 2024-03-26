package staticTest;

class ClassA{
	int iVar;
	static int sVar;
	
//	인스턴스 메소드는 인스턴스, 스태틱 맴버를 사용 가능하다.
	void iMethod1() {
		iVar =100;
		sVar =200;
		iMethod2();
		sMethod2();
	}
	
	void iMethod2() {
		
	}
	
//	스태틱 메소드는 스태틱 맴버만 사용 가능하다.
	static void sMethod1() {
//		iVar =10;
		sVar =20;
//		iMethod2();
		sMethod2();
	}
	
	static void sMethod2() {
		ClassA a = new ClassA();
		a.iMethod2();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		
//		다른 클래스에서 instance멤버를 사용하는 경우
//		무조건 객체를 찍어서 사용해야한다.
		ClassA a = new ClassA();
		
		a.iVar = 10;
		a.iMethod1();
		a.iMethod2();
		
//		다른 클래스에서 static 멤버를 사용하는 경우
//		객체를 찍는게 아니라 클래스 이름 뒤에 .을 찍어서 사용한다.
		ClassA.sVar =10;
		ClassA.sMethod1();
		ClassA.sMethod2();
	}

}




















