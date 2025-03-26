package ex0213.제어문;

public class IfExam01 {
	
	// 실행을 위해서 반드시 필요한 메인메서드 작성
	public static void main(String[] args) {
		// 메인 메소드 안에서 정수형 변수를 하나 선언하고 값을 초기화 한다.
		// 선언한 변수의 값이 짝수 인지 홀수 인지 출력한다.
		// 결과 : ex) 5는 홀수 입니다. or 10은 짝수입니다.
		
//		int number = 5;
		int number = (int)(Math.random() * 100) + 1;
		
		if (number % 2 == 0) {
			System.out.println(number+"은" +" 짝수입니다.");
		} else {
			System.out.println(number +" 홀수입니다.");
		}
		
				
//		System.out.println(number % 2 == 0 ? "짝수입니다." : "홀수입니다.");
	
		
		
	}
}
