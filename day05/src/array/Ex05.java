package array;

public class Ex05 {
	public static void main(String[] args) {
//		배열 선언 후 1~10까지의 값 넣기
		
		int[] arData = new int[10];
		
		for(int i=0;i<arData.length;i++) {
			arData[i] = i+1;
		}
		
		
		for(int i=0;i<arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		
				
	}
}
