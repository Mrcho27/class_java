package method;

public class Ex03 {
	public static void main(String[] args) {
	
//		printHello();
//		
//		
//		System.out.println(    returnNumber()    );
//		int num = returnNumber();
//		
//		System.out.println(num);
		
		printName("김철수");
		
		printFavorite("판다","초록색");
		printFavorite("강아지","주황색");
		
		int num =addNumber(100,20);
		System.out.println(num);
		
		
	}
	
	static int addNumber(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	
	static void printFavorite(String animal, String color) {
		System.out.println("내가 좋아하는 동물은 "+animal + " 내가 좋아하는 색은 "+ color);
	}
	
	static void printName(String name) {
		System.out.println(name);
	}
	
	static int returnNumber() {
		return 10;
	}
	
	static void printHello() {
		System.out.println("Hello~");
	}
	
	
}
