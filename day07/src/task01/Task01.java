package task01;

/*
 * 자동차 클래스를 만든다.(별도의 파일로 생성)
 * 
 * 브랜드, 색상, 가격 정보를 저장해야한다.
 * engineStart() 라는 기능을 만들고 실행하면 "시동 켜짐" 을 출력한다.
 */


public class Task01 {
	public static void main(String[] args) {
		
		Car car = new Car("BMW","White",8000);
		
//		System.out.println(car.brand);
//		System.out.println(car.color);
//		System.out.println(car.price);
		car.printCarInfo();
		car.enginStart();
		
		Car car2 = new Car("KIA","White",3000);
		
//		System.out.println(car2.brand);
//		System.out.println(car2.color);
//		System.out.println(car2.price);
		car2.printCarInfo();
		car2.enginStart();
	}
}
