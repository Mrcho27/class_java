package accessModifier;

public class Main {
	public static void main(String[] args) {
		ClassA a = new ClassA(3);
		
//		a.
		a.setVar4(10);
		
		System.out.println(a.getVar4());
		
		
	}
}
