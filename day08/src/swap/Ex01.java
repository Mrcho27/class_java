package swap;

public class Ex01 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
//		int tmp = 0;
//		
//		tmp=a;
//		a=b;
//		b=tmp;
		
		swap(a,b);
		
		System.out.println(a);
		System.out.println(b);
		
		int[]ar = {10,20};
		swap(ar);
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		
	}
	
	static void swap(int[] ar) {
		int tmp =0;
		tmp = ar[0];
		ar[0] = ar[1];
		ar[1] = tmp;
	}
	
	static void swap(int a,int b) {
		int tmp = 0;
		tmp = a;
		a = b;
		b= tmp;
	}
}
