package ex0218.homework.sort;

import java.util.Arrays;

/**
 * 선택 정렬 구현 : 배열에서 가장 작은 값을 찾아서 맨 앞에 배치하는 방식 
 * 이를 반복해서 배열을 정렬
 */

public class SortArraySelection {

	public static void main(String[] args) {
		
		int arr [] = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		int len = arr.length;
		int min = 0;
		int temp = 0;
		
		for(int i = 0; i < len - 1; i++) {
			min = i;
			for(int j = i+1; j < len; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			System.out.println("min = "+min+" i = "+i);
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println("정렬 i = "+Arrays.toString(arr));
			System.out.println();
		}
	}
	
//	public void sortArr() {
//		int len = arr.length;
//		
//		for (int i = 0; i < len - 1; i++) {
//			int min = i;
//			
//			for (int j = i + 1; j < len; j++) {
//				if (arr[j] < arr[min]) {
//					min = j;
//				}
//			}
//			
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		
//		for (int i = 0; i < len; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//	
//	public static void main(String[] args) {
//		SortArray sa = new SortArray();
//		sa.sortArr();
//	}
}
