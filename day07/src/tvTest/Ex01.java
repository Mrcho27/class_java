package tvTest;

public class Ex01 {
	public static void main(String[] args) {
		Tv tv = new Tv(10,10,"white");
		tv.ch =10;
		
		System.out.println(tv.ch);
		System.out.println(tv.vol);
		System.out.println(tv.color);
		System.out.println(tv.power);
		
		
//		생성자를 사용하면 객체를 만듬과 동시에 내가 원하는 값으로 초기화 할 수 있다.
		Tv tv2 = new Tv(1,1,"Black");
	
		System.out.println(tv2.color);
		
		
	}
}
