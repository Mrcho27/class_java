package task01;

public class Car {
	
	String brand;
	String color;
	int price;
	
	public Car(String brand,String color,int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	void enginStart() {
		System.out.println("시동 켜짐");
	}
	
	void printCarInfo() {
		System.out.println("brand >>"+ this.brand);
		System.out.println("color >>"+ this.color);
		System.out.println("price >>" + this.price);
		
	}

}
