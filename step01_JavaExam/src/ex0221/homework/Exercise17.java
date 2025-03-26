package ex0221.homework;

/**
 * chatper06-17번 문제
 * 
 */
class Printer01 {
	
	public static void println(int i) {
		System.out.println(i);
	}
	
	public static void println(boolean t) {
		System.out.println(t);
	}
	
	public static void println(double d) {
		System.out.println(d);
	}
	
	public static void println(String s) {
		System.out.println(s);
	}
}


public class Exercise17 {
	
	public static void main(String[] args) {
		
		Printer01.println(10);
		Printer01.println(true);
		Printer01.println(5.7);
		Printer01.println("홍길동");
		
	}
	
}
