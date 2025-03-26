package ex0214.homework;

/**
 * Chapter04 - 4번 문제
 * while 문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈의 형태 출력
 * 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드 작성 
 */

public class Exercise04 {
	
	public static void main(String[] args) {
		
		while(true) {
			int eye1 = (int)(Math.random() * 6) + 1;
			int eye2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("("+eye1+","+eye2+")"+" ");
			
			if (eye1 + eye2 == 5) break;	
		}
	}
}
