package tvTest;

public class Tv {
	int ch;
	int vol;
	int price;
	String color;
	boolean power;
	
	public Tv(int ch, int vol, String color) {
		System.out.println("기본 생성자 실행!!");
		this.ch = ch;
		this.vol = vol;
		this.color =color;
	}
}
