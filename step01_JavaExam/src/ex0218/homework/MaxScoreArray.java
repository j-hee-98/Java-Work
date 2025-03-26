package ex0218.homework;

/**
 * chapter05 - 7번 문제
 * 배열 항목에서 최대값을 출력하는 코드를 작성
 */

public class MaxScoreArray {

int[] array = {1, 5, 3, 8, 2};
	
	public void maxNum() {
		
		int max = array[0];
		for (int index = 1; index < array.length; index++) {
			
			if (array[index] > max) {
				max = array[index];
			}
		}
		System.out.println("최대 값 : "+ max);
	}
	
	public static void main(String[] args) {
		
		MaxScoreArray msa = new MaxScoreArray();
		msa.maxNum();
	}
}
