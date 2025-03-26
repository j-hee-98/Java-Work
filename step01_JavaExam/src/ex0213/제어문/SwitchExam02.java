package ex0213.제어문;

public class SwitchExam02 {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 12) + 1;
		// 달의 28, 30, 31
		
		switch (num) {
		case 4, 6, 9, 11 : System.out.println(num+"월 달은 30일까지"); break;
		case 2 : System.out.println(num+"월 달은 28일까지"); break;
		default : System.out.println(num+"월 달은 31일까지");
		}
		
//		int num = (int)(Math.random() * 12) + 1;
//		// 달의 28, 30, 31
//		
//		switch (num) {
//		case 4, 6, 9, 11 : mon = 30; break;
//		case 2 : mon = 28; break;
//		}
//		System.out.println(num+"월 달은 " +mon+"일까지");
		
//		switch (num) {
//		case 2 -> { mon = 28; }
//		case 4, 6, 9, 11 -> {mon = 30;}
//		}
		
		// switch 새로운 타입
		
//		mon = switch(num) {
//		case 2 -> 28;
//		case 4, 6, 9, 11 -> 30;
//		default -> 31;
//		};
		int mon = 31;
		
		mon = switch(num) {
		
		case 2 -> 28;
		case 4, 6, 9, 11 -> {
			System.out.println("dddd");
			yield 30;
		}
		default -> 31;
		};
		System.out.println(mon);
		
	}
}
