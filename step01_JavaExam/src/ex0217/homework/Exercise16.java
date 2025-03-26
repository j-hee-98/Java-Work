package ex0217.homework;

public class Exercise16 {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		System.out.println(p.println(10));
//		p.println(10);
		p.println(true);
		p.println(5.7);
		p.println("홍길동");
	}
}

class Printer {
	
	int println(int x) {

		return x;
		
	}
	
	boolean println(boolean y) {
		
		return y;
	}
	
	double println(double z) {
		
		return z;
	}
	
	String println(String s) {
		
		return s;
	}
}
