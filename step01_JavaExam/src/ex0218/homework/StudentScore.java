package ex0218.homework;

import java.util.Scanner;

/**
 * chapter05 - 9번 문제
 * 학생들의 점수를 분석하는 프로그램
 */

public class StudentScore {

	Scanner sc = new Scanner(System.in);
	int[] scores = null;
	int numStu = 0;
	
	public static void main(String[] args) {
		
		StudentScore stuScore = new StudentScore();
		
		while(true) {
			
			/**
			 * 메뉴 출력 메서드 사용
			 */
			stuScore.showMenu();
			
			String choice = stuScore.sc.nextLine();
			
			switch(choice) {
			
			case "1":
				stuScore.inStuCount(); break;
			
			case "2":
				stuScore.inScore(); break;
			
			case "3":
				stuScore.printScore(); break;
				
			case "4":
				stuScore.anaScore(); break;
				
			case "5":
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
				
			}
		}
	}
	
	/**
	 * 메뉴 출력 메서드
	 */
	public void showMenu() {
		System.out.println("-------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("-------------------------------------------------------");
		System.out.print("선택> ");
	}
	
	/**
	 * 학생 수 입력 메서드
	 */
	public void inStuCount() {
		System.out.print("학생수> ");
		numStu = Integer.parseInt(sc.nextLine());
		scores = new int[numStu];
	}
	
	/**
	 * 점수 입력 메서드
	 */
	public void inScore() {
		for (int i = 0; i < numStu; i++) {
			System.out.print("scores["+i+"]> ");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
	}
	
	/**
	 * 점수 리스트 출력 메서드
	 */
	public void printScore() {
		for (int i = 0; i < numStu; i++) {
			System.out.println("scores["+i+"]> "+scores[i]);
		}
	}
	
	/**
	 * 분석 메서드
	 */
	public void anaScore() {
		
		int maxScore = scores[0];
		int sum = 0;
		
		for (int i = 0; i < numStu; i++) {
			sum += scores[i];
			
			if (scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		
		double average = (double) sum / numStu;
		System.out.println("최고 점수 : "+maxScore);
		System.out.println("평균 점수 : "+average);
	}
}
