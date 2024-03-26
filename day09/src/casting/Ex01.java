package casting;

class Tv{
	int vol;
	int ch;
	
	void chUp() {}
	void chDown() {}
}

class SmartTv extends Tv{
	
	void netflix() {}
}

public class Ex01 {
	public static void main(String[] args) {
//		** up casting **
//		1.
//		SmartTv smartTv = new SmartTv();
//		Tv tv = (Tv)smartTv;
		
//		2.
//		Tv tv = (Tv)new SmartTv();
		
//		3.
		Tv tv = new SmartTv();
//		부모클래스 타입의 참조변수로 자식클래스 타입의 객체를 가리키게 한다.
		
		tv.ch = 10;
		tv.vol = 3;
		tv.chDown();
//		tv.netflix();
		
		
//		잘못된 Down Casting
//		Tv parents = new Tv();
//		SmartTv child = (SmartTv)parents;
//		다운 캐스팅은 반드시 업 캐스팅이 된 값으로 해야한다.
//		즉, 업 캐스팅 된 값을 다시 원래의 자식타입으로 돌리는 것이 다운 캐스팅이다.
		
		
//		**Down Casting**
		SmartTv smartTv = (SmartTv)tv;
		
		System.out.println(smartTv.vol);
		
	}
}


























