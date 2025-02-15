package list;

/*
 * 제네릭을 사용하는 이유
 * 1. 제네릭을 사용하지 않는다면 필드의 타입별로 클래스를 만들어야한다.
 * 2. 제네릭 대신 Object타입을 사용한다면 타입검사와 다운캐스팅을 계속 해야한다.
 * 3. 제네릭은 클래스를 만드는 입장에서는 타입의 유연함을 제공하고
 * 클래스를 사용하는 입장에서는 타입을 제한할 수 있다.
 * 
 */

class MyClass<T> {
	T data;

	public MyClass(T data) {
		this.data = data;
	}

	void printData() {
		System.out.println(data);
	}
}

public class GenericTest {
	public static void main(String[] args) {

		MyClass<Integer> mc = new MyClass<Integer>(3);
		MyClass<String> mc2 = new MyClass<String>("hi");

		mc.printData();
		mc2.printData();

	}
}
