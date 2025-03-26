package ex0213.연산자;

class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t=true ;
		boolean f=false;
		System.out.println("true&false="+(t&f)); // false
		System.out.println("true&true="+(t&t)); // true
		System.out.println("false&false="+(f&f)); // false
		System.out.println();
	
		System.out.println("true|false="+(t|f)); // true
		System.out.println("true|true="+(t|t)); // true
		System.out.println("false|false="+(f|f)); // false
		System.out.println();

		System.out.println("true^false="+(t^f)); // true
		System.out.println("true^true="+(t^t)); // false
		System.out.println("true^false="+(t^f)); // true
		System.out.println("true^true="+(t^t)); // false
		System.out.println();

		System.out.println("true&&false="+(t&&f)); // false
		System.out.println("true&&true="+(t&&t)); // true
		System.out.println("true&&false="+(t&&f)); // false
		System.out.println("false&&false="+(f&&f)); // false
		System.out.println();

		System.out.println("true||false="+(t||f)); // true
		System.out.println("true||true="+(t||t)); // true
		System.out.println("false||false="+(f||f)); // false
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j); // 5	3
		System.out.println("i>=j==>>"+(i>=j)); // true
		System.out.println("i>j=>>"+(i>j)); // true
		System.out.println("i<=j=>>"+(i<=j)); // false
		System.out.println("i<j=>>"+(i<j)); // false
		System.out.println("i==j=>>"+(i==j)); // false
		System.out.println("i!=j=>>"+(i != j)); // true
		
		// 평균이 60이상이면 합격, 아니면 불합격
		double avg = 70; // promotion (자동으로 바뀜)
		String res = avg >= 60 ? "합격" : "불합격";
		System.out.println(avg + " 결과는 : "+res);
		
		System.out.println();
		
//		System.out.println(5/0);
		System.out.println(5/0.0);
		System.out.println(5%0.0);		
		System.out.println();
		
		byte a = 3, c = 5;
		
		byte g = (byte)(a + c);
		System.out.println(g);
//		int g = a + c;		

	}
	
	public static boolean test() {
		System.out.println("test call...");
		
		return true;
	}
}


// 실수형은 정수형보다 용량(바이트)를 많이 차지함
// Integer.parseInt("4");
// Integer.toString(4);