package objectArray;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		int[][] arr = new int[3][5];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j] = i*j;
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}
}
