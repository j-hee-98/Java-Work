package ex0213.제어문;

public class IfExam02 {

	public static void main(String[] args) {
		
		// 1 ~ 12 사이 난수 발생 해서 변수에 담는다
		// 발생한 난수가 1이면 일요일, 2이면 월요일, 3이면 화요일, 4이면 수요일
		// 5이면 목요일 6이면 금요일, 이외의 수는 토요일 출력한다.
		
		int num = (int)(Math.random() * 12) + 1;
		
		if (num == 1) {
			System.out.println(num+"일은"+" 일");
		} else if (num == 2) {
			System.out.println(num+"일은"+" 월");
		} else if (num == 3) {
			System.out.println(num+"일은"+" 화");
		} else if (num == 4) {
			System.out.println(num+"일은"+" 수");
		} else if (num == 5) {
			System.out.println(num+"일은"+" 목");
		} else if (num == 6) {
			System.out.println(num+"일은"+" 금");
		} else {
			System.out.println(num+"일은"+" 토");
		}
		
		char ch = '토';
		
		if (num == 1) ch = '일';
		else if (num == 2) ch = '월';
		else if (num == 3) ch = '화';
		else if (num == 4) ch = '수';
		else if (num == 5) ch = '목';
		else if (num == 6) ch = '금';
		else ch = '월';
		System.out.println(num +"일은 "+ ch);
	}

	
}
