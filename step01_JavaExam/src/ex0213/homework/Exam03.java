package ex0213.homework;

public class Exam03 {
	
	public static void main(String[] args) {
		
		String name = "조재희";
		
		int lang = (int)(Math.random() * 55) + 45; // 국어
		int eng = (int)(Math.random() * 55) + 45; // 영어
		int math = (int)(Math.random() * 55) + 45; // 수학
		
		
		int maxScore = (lang + eng + math);
		double avg = (double)(maxScore / 3.0);
		char ch = 'F';
		
		// if 문
		
		if (avg >= 90) ch = 'A';
		else if (avg >= 80) ch = 'B';
		else if (avg >= 70) ch = 'C';
		else if (avg >= 60) ch = 'D';
		
		System.out.println(name+ "님의 국어점수 : "+lang+ ","
				+ " 영어점수 : "+eng+", 수학점수 : "+math+", 총점 : "+maxScore+", 평균 : "+avg+", 학점은 "+ch+"입니다.");
		
		
		// switch 문
		int intAvg = (int)avg;
		switch(intAvg) {
		case 9 : ch = 'A'; break;
		case 8 : ch = 'B'; break;
		case 7 : ch = 'C'; break;
		case 6 : ch = 'D'; break;
		}
		System.out.println(name+ "님의 국어점수 : "+lang+ ","
				+ " 영어점수 : "+eng+", 수학점수 : "+math+", 총점 : "+maxScore+", 평균 : "+avg+", 학점은 "+ch+"입니다.");
		
	}
}
