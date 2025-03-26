package ex0218.homework.sort;

import java.util.Arrays;

/**
 * 삽입 정렬
 * : 아직 정렬되지 않은 데이터를 
 * 이미 정렬된 부분의 적절한 위체 삽입해 가며 정렬하는 방식
 */

public class SortArrayInsertion {

	public static void main(String[] args) {
		
		int arr [] = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			int target = i + 1; // 아직 정렬되지 않은 임의의 수
			for (int j = 0; j < target; j++) {
				if(arr[j] > arr[target]) {
					int temp = arr[j];
					arr[j] =arr[target];
					arr[target] = temp;
				}
			}
		}
		System.out.println("정렬 후 : "+Arrays.toString(arr));		
	}
}
