package ex0214.scannerex;

import java.util.Scanner;

public class ScannerExam {
	
	public static void main(String[] args) {
		
		// 키보드 입력
		Scanner sc = new Scanner(System.in); // 키보드 입력 받을 준비 완료
		
//		System.out.print("국어점수 : ");
//		int kor = sc.nextInt();	// 키보드 입력 숫자 받기
////		System.out.println("입력 점수는 : "+ kor);
//		
//		System.out.print("영어점수 : ");
//		int eng = sc.nextInt();
////		System.out.println("입력 점수는 : "+ eng);
//		System.out.print("이름은 : ");
////		String name = sc.next();
//		
//		sc.nextLine(); // 기존에 남아 있는 \n을 제거한다.
//		String name = sc.nextLine();
//		
//		System.out.println(name+"님 총점은 = "+(kor+eng));
		
		while(true) {
			System.out.println("1. 성적구하기   2. 종료");
			System.out.println("메뉴선택 > ");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {
			case 1:
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();	// 키보드 입력 숫자 받기
//				System.out.println("입력 점수는 : "+ kor);
				
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
//				System.out.println("입력 점수는 : "+ eng);
				System.out.print("이름은 : ");
//				String name = sc.next();
					
				sc.nextLine(); // 기존에 남아 있는 \n을 제거한다.
				String name = sc.nextLine();
				
				System.out.println(name+"님 총점은 = "+(kor+eng));
			case 2:
				System.out.println("다음 기회에~");
				System.exit(0);
			default : System.out.println("다른 번호 누르지마세요.");
			}
		}
	}
}
