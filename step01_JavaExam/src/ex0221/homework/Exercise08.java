package ex0221.homework;

/**
 * chapter5 - 8번 문제
 * 주어진 배열 항목의 전체 합과 평균을 구해 출려하는 코드 작성
 */

public class Exercise08 {

	public static void main(String[] args) {
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg;
		int count = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			int len = array[i].length;
			
			for (int j = 0; j < len; j++) {
				System.out.print(array[i][j]+" ");
				sum += array[i][j];
				count++;
			}
		}
		
		avg = (double) sum / count;
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
