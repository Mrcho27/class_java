package interTask;



public class Main {
	public static void main(String[] args) {
		BasicFan bf = new BasicFan();
		
		
		
		method(bf);
		System.out.println("=====================");
		method(new BasicFan2());
		System.out.println("=====================");
		method(new SmartFan());
		
		
	}
	
	static void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
	}
}
