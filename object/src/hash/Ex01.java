package hash;

class ClassA{
	
	
}

public class Ex01 {
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		ClassA a2 = new ClassA();
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		System.out.println(Integer.toHexString(a1.hashCode()));
		System.out.println(Integer.toHexString(a2.hashCode()));
		
	}
}
