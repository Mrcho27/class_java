package classTest;

public class Tv {
	int ch;
	int vol;
	boolean power;
	String color;
	
	public Tv() {}
	
	
	
	public Tv(int ch, int vol, boolean power) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.power = power;
	}


	public Tv(int ch, int vol, boolean power, String color) {
		
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.color = color;
	}
	
	void powerOnOff() {
		power = !power;
	}
	
	int chUp() {
		return ++ch;
	}
	
	int chDown() {
		return --ch;
	}
	
	
	
}






















