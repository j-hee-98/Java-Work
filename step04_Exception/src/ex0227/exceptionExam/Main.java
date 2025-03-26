package ex0227.exceptionExam;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("***ShoppingMall OPEN***");
		ShoppingMall sm = new ShoppingMall();
		
		//난수발생 전용 클래스
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			try {
				int age = r.nextInt(55)+1;
				sm.enter(age);
				
			} catch (NoKidsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println();
		}
			System.out.println("***ShoppingMall OPEN***");
			// 예외발생 개수
			System.out.println("예외 개수 = "+NoKidsException.count);
	}
}
