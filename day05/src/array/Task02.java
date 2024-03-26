package array;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
//		0 ,1, 2, 3, 4, 0, 1, 2, 3, 4 배열에 담고 출력(반복문 사용)
		int arr1[] = new int[10];
		
		for(int i= 0; i<arr1.length; i++) {
			arr1[i] = i%5;
		}
		
		for(int i= 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("=========================");
//		A~F까지 배열에 넣고 출력
		char arr2[] = new char[6];
		
		for(int i =0; i<arr2.length; i++) {
			arr2[i] = (char)('A'+i);
		}
		
		for(int i =0; i<arr2.length; i++) {
			arr2[i] =(char)('A'+i);
			System.out.println((char)arr2[i]);
		}
	
		System.out.println("=========================");
		
//		A~F까지 중 C 제외하고 배열에 담고 출력
		char arr3[] = new char[5];
		int tmp = 0;
		
		for(int i =0; i<arr3.length; i++) {
			tmp = i;
			
			if(tmp>1) {tmp++;}
			arr3[i] =(char)('A'+tmp);
		}
	
		for(int i =0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
			}
		}
	
		
	
//	for(int i =0; i<arr3.length; i++) {
//	arr3[i] = (char)('A'+i);
//	if(i>=2) {
//		arr3[i] =(char)('B'+i);
//	}
//}
//
//for(int i =0; i<arr3.length; i++) {
//	arr3[i] =  (char)('A'+i);
//	if(i>=2) {
//		arr3[i] =(char)('B'+i);
//	}
//	System.out.println((char)arr3[i]);
//}
	

	}

