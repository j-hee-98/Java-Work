package ex0214.homework;

/**
 * chapter04 - 5번 문제
 * 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드 작성
 * (x와 y는 10 이하의 자연수이다.)
 */

public class Exercise05 {
	
	public static void main(String[] args) {
		
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.print("("+x+","+y+")"+ " ");					
				}
			}
		}
	}
}
