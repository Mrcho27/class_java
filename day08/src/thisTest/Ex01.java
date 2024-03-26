package thisTest;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {
		this("기아","Blue",3500);
//		this.brand = "기아";
//		this.color = "Blue";
//		this.price = 3500;
	}
	
	
	public Car(String brand, int price) {
		this(brand,"White",price);
		System.out.println("생성자 실행!");
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Car car1 = new Car("현대","White",3000);
		Car car2 = new Car("현대", 2500);
		
		System.out.println(car2.brand);
		System.out.println(car2.color);
		System.out.println(car2.price);
	}
}
