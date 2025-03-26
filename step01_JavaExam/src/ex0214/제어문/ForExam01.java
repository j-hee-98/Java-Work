package ex0214.제어문;

public class ForExam01 {

	public static void main(String [] args) {
		
		//1. 1~ 100가지 한줄로 출력

		int i;
		
		for (i=1; i <= 100; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//2. A ~Z 까지 한줄로 출력
		
		int j;
		
		for (j=65; j<=90; j++) {
			System.out.print((char)j+" ");
		}
		System.out.println();
		
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch+" ");
		}
		
		System.out.println();

		//3. 1~ 10 까지  합 구해서 출력
		
		int su;
		int sum = 0;
		for (su = 1; su <= 10; su++) {
			sum += su;
		}
		System.out.print(sum);
		
		System.out.println();
		
		//4. 1 ~ 100 사이의 7의 배수만 출력
		int sev;
		
		for (sev=1; sev<=100; sev++) {
			if (sev % 7 == 0) {
				System.out.print(sev+" ");
			}
		}
		
		System.out.println();

		//5. 100 ~ 1 사이의 5 의 배수만 출력
		int five;
		
		for (five=100; five>=1; five--) {
			if (five % 5 == 0) {
				System.out.print(five+" ");
			}
		}
		
	}
}
