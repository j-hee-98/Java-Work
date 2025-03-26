package ex0218.homework.sort;

import java.util.Arrays;

/**
 * 오름차순 정렬
 * bubble 정렬 : 서로 이웃한 데이터들을 비교하여 
 * 가장 큰 데이터를 가장 뒤로 보내며 접근하는 방식
 */

public class SortArrayBubble {
	
	
	public static void main(String[] args) {
		
		int arr [] = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
		
		System.out.println(arr);
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		int temp = 0;
		
		for (int i = arr.length - 1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("정렬 후 : "+Arrays.toString(arr));
		
	}
	
}
