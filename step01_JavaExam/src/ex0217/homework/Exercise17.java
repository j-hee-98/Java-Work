package ex0217.homework;

public class Exercise17 {

	public static void main(String[] args) {
		
		System.out.println(Printer01.println(10));
//		p.println(10);
		Printer01.println(true);
		Printer01.println(5.7);
		Printer01.println("홍길동");
		
	}
}

class Printer01 {
	
	static int println(int x) {

		return x;
		
	}
	
	static boolean println(boolean y) {
		
		return y;
	}
	
	static double println(double z) {
		
		return z;
	}
	
	static String println(String s) {
		
		return s;
	}
}
