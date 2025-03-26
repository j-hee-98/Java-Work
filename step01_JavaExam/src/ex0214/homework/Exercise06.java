package ex0214.homework;

/**
 * Chapter04 - 6번 문제
 * for 문을 이용해서 삼각형 별 만들기
 * */

public class Exercise06 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
