package staticTest;

class Test{
	static int var1;
	int var2;
}

public class Ex01 {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		System.out.println(t1.var1);
		System.out.println(t1.var2);
		
		Test.var1 = 10;
		t1.var2 = 20;
		
		Test.var1 = 100;
		t2.var2 = 200;
		
		System.out.println(Test.var1);
		System.out.println(t1.var2);
		System.out.println("================");
		System.out.println(Test.var1);
		System.out.println(t2.var2);
		
	}
}
