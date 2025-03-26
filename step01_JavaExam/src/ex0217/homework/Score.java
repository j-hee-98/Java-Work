package ex0217.homework;


/**
 * 성적 구하는 코드
 * 성적 구하는 기능을 담당하는 클래스
 * 
 */
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Recode r = new Recode();
		
		
		while(true) {
		
			System.out.println("----------------------------");
			System.out.println("1. 성적표구하기    2. 종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			String choice = sc.nextLine();
			
			switch (choice) {
			case "1":
				System.out.print("이름 : ");                                           
				String name = sc.nextLine();
				System.out.print("국어점수? ");
				int lang = Integer.parseInt(sc.nextLine());
				System.out.print("영어점수? ");
				
				
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학점수? ");
				int math = Integer.parseInt(sc.nextLine());
				
				System.out.println();
				String resu = r.res(name, lang, eng, math);
				System.out.println(resu);
				break;
				
				
				
				
			case "2":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);	
			}
			
		}
	}
}

class Recode {
	
	// 총점 구하는 메서드
	private int maxScore(int lang, int eng, int math) {
		
		return lang + eng + math;
	}
	
	// 평균 구하는 메서드
	private double avg(int x, int num) {
		
		return (double)x / num;
		
	}
	
	// 등급 구하는 메서드
	private String grade(double g) {
		
		if (g >= 90) return "A";
		else if (g >= 80) return "B";
		else if (g >= 70) return "C";
		else if (g >= 60) return "D";
		else return "F";
		
	}
	
	public String res(String name, int lang, int eng, int math) {
		
		int maxSc = maxScore(lang, eng, math);
		double a = avg(maxSc, 3);
		String gr = grade(a);
		return name+"님의"+" 국어점수: "+lang+" 영어점수: "+eng+" 수학점수: "+math+"\n"+"총점 : "+maxSc+" 평균 : "+a+" 등급 : "+gr;

	}
}