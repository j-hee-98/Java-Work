package ex0218.homework.sort;

import java.util.Arrays;

/**
 * 실습 문제 - 배열 1번
 * 배열방에 있는 데이터를 올림차순으로 정렬
 * 
 * 정렬알고리즘 (선택, 버블, 삽입)
 */

public class SortArray {
	
	int arr [] = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
	
	public void sortArr() {
		
		Arrays.sort(arr);
		int len = arr.length;
		
		for (int index = 0; index < len; index++) {
			System.out.print(arr[index]+ " ");
		}
	}
	
	public static void main(String[] args) {
		
		SortArray sa = new SortArray();
		sa.sortArr();
	}
}
