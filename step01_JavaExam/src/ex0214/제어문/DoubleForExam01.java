package ex0214.제어문;

public class DoubleForExam01 {
	
	public static void main(String [] args) {
		int i;
		int j;
		
		//1.  1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)
		
		int sum = 1;
		
		for (i = 1; i < 10; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.print(sum++ +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//2. 1 ~ 100가지 10행 10열로 출력 (for문 안에  if문이용)
		for (i = 1; i <= 100; i++) {
			System.out.print(i+ " ");
			if (i%10==0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		
		//3. 구구단 출력  -  for 문안에 for문이용
		/*
				 * 
				 *  2*1=2  3*1=3 ..... 9*1=9
				 *  2*2=4  3*2=4  4*2=4
				 *  2*3=6
				 *  ..
				 *  
				 *  2*9=18              9*9=81
				 * 
				 * */
		
		for(i=1; i<=9; i++) {
			for(j=2; j<=9; j++) {
				System.out.print(i+"*"+j +"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
