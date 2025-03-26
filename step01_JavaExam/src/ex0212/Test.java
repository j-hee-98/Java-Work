package ex0212;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("\"안녕\n하세연");
		System.out.print("Good");
		
		
		char ch0 = 'A';
		char ch1 = 65;
		char ch2 = 0x0041;
		char ch3 = '\u0041';
		
		System.out.println(ch0);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		int a = 1;
		int b = 1;
		
//		a = b++;
		a = ++b;
		
		System.out.println(a);
		System.out.println(a > b ? true : false);
	}

}


