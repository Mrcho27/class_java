package car;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.enginStart();
		
		SuperCar superCar = new SuperCar("BMW", "White",1000,false);
		superCar.enginStart();
	}
	
	
}
