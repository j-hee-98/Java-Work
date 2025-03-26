package ex0214.제어문;

public class BreakContinueExam {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
//				if(j==3) break; // 아래문장 실행안하고 자기를 감싼 for문 빠져나감
//				if(j==3) continue; // 아래문장 실행안하고 그 다음 일을 하러 간다
				
				if(i==3) break; // 안에 중첩된 for문만 빠져나가서 가운데가 비어서 출력
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		System.out.println("----End----");
		System.out.println();
		
		for(int row = 1; row <=9; row++) {
			for (int col = 1; col <=9; col++) {
				if(col == 5) continue; 
				System.out.print(col + " * "+row+" = "+(row*col)+"\t");

			}
			System.out.println();
		}
		
		System.out.println();
		
		
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if (i == 5) break;
//				System.out.print(j+" * "+i+" = "+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
	}
}
