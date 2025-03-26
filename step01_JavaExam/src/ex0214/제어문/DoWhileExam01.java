package ex0214.제어문;

public class DoWhileExam01 {

	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			i++;
			System.out.print(i+" ");
		} while(i<100);
		
		System.out.println();
		
//		char ch = 'A';
//		
//		do {
//			ch++;
//			System.out.print(ch+" ");
//		} while(ch < 'Z');
//		
		int ch = 64;
		
		do {
			ch++;
			System.out.print((char)ch+" ");
			
		}while(ch<90);
		System.out.println();
		
		
		int num = 0;
		int sum = 0;
		
		do {
			num++;
			sum += num;
		} while(num < 10);
		System.out.print(sum+" ");
		
		System.out.println();
		
		int a = 0;
		
		do {
			a++;
			if (a % 7 == 0) {
				System.out.print(a+" ");
			}
		} while(a < 100);
		
		System.out.println();
		
		int b = 101;
		
		do {
			b--;
			if (b % 5 == 0) {
				System.out.print(b+" ");
			}
		} while(b > 1);
	}
}
