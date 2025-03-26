package ex0214.제어문;

public class WhileExam01 {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		while( i < 100) {
			i++;
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		
		int j = 64;
		while (j < 90) {
			j++;
			System.out.print((char)j+" ");
		}
		
		System.out.println();
		
		int sum = 0;
		int n = 1;
		
		while(n <= 10) {
			sum += n;
			n++;
		}
		System.out.print(sum+" ");
		
		System.out.println();
		

		int se = 1;
		while(se <= 100) {
			se++;
			if(se % 7 == 0) {
				System.out.print(se+" ");
			}
		}
		
		System.out.println();
		
		int fi = 101;
		while(fi > 1) {
			fi--;
			if (fi % 5 == 0) {
				System.out.print(fi+" ");
			}
		}
		
		System.out.println();
		
		// 10행 10열
		int row = 0;
		
		while (row < 10) {	
			int col = 0;
			while (col < 10) {
				col++;
				System.out.print(col +" ");
			}
			System.out.print("\n");
			row++;
		}
		System.out.println(row);
		
	}
}
