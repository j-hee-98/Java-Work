package ex0214.homework;

/**
 * chapter04 - 7번 문제

 * while 문과 Scanner의 nextLine() 메소드를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
 * 
 * boolean state = false;
 * switch문에서 break를 써도 while에서는 나가지 않으니 state 변수를 선언해서
 * state switch 문 종료 부분에 넣어서 프로그램 종료 시킴
 */

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		int balance = 0;	// 초기 잔고
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				System.out.print("예금액> ");
				int deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
				System.out.println("예금이 완료되었습니다.");
				break;
			
			case 2:
				System.out.print("출금액> ");
				int withdraw = Integer.parseInt(sc.nextLine());
				if (withdraw <= balance) {
					balance -= withdraw;
					System.out.println("출금이 완료되었습니다.");
				} else {
					System.out.println("잔고가 부족합니다.");
				}
				break;
				
			case 3:
				System.out.println("현재 잔고: "+balance+"원 입니다."); break;
			
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
			default:
				System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
				break;
				
			}
		}
		
//		int balance = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			
//			System.out.println("-----------------------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("-----------------------------------------");
//			System.out.print("선택> ");
//			
//			int choice = Integer.parseInt(sc.nextLine());
//			
//			String res = switch(choice) {
//				case 1 -> {
//					System.out.print("예금액> ");
//					int deposit = Integer.parseInt(sc.nextLine());
//					balance += deposit;
//					yield "예금이 완료되었습니다";
//				}
//				case 2 -> {
//					System.out.print("출금액> ");
//					int withdraw = Integer.parseInt(sc.nextLine());
//					if (withdraw <= balance) {
//						balance -= withdraw;
//						yield "출금이 완료되었습니다.";
//					} else {
//						yield "잔고가 부족합니다.";
//					}
//				}
//				case 3 -> "현재 잔고: "+balance+"원 입니다.";
//				case 4 -> {
//					System.out.println("프로그램을 종료합니다.");
//					System.exit(0);
//					yield "";
//				}
//				default -> "잘못된 입력입니다. 다시 시도해주세요.";
//			};
//		}
	}
}
