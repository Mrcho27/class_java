package wrapper;

public class Ex01 {
	public static void main(String[] args) {
//		boxing
		Integer numInt = new Integer(3);
		Integer numInt2 = Integer.valueOf(3);
		
		Double numDouble = new Double(3.14);
		Double numDouble2 = Double.valueOf(3.14);
		
//		unboxing
		int num = numInt.intValue();
		
//		auto boxing
		Integer numInt3 =3;
		
//		auto unboxing
		int num2 = numInt3;
		
		
		
	}
}
