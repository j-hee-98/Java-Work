package ex0221.homework;

/**
 * chapter6 - 16번 문제
 * - Printer 클래스에서 println() 메서드를 오버로딩하여 선언
 */

class Printer {
	
	public void println(int i) {
		System.out.println(i);
	}
	
	public void println(boolean t) {
		System.out.println(t);
	}
	
	public void println(double d) {
		System.out.println(d);
	}
	
	public void println(String s) {
		System.out.println(s);
	}
}


public class Exercise16 {
	
	public static void main(String[] args) {
		
		Printer pr = new Printer();
		pr.println(10);
		pr.println(true);
		pr.println(5.7);
		pr.println("홍길동");
		
	}
}
