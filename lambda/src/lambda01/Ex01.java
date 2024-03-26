package lambda01;

public class Ex01 {
	public static void main(String[] args) {
		FuntionalInter fi = new FuntionalInter() {
			
			@Override
			public void method() {
				System.out.println("익명 클래스의 메소드 재정의");
			}
		};
		
		FuntionalInter fi2 = () -> System.out.println("람다식");
		
		fi.method();
		fi2.method();
		
	}
}
