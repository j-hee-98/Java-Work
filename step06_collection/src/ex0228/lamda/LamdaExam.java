package ex0228.lamda;

public class LamdaExam {

	public static void main(String[] args) {
//		1. 기존방식
//		AInterface a = new Test();
//		a.aa();
		
//		2. Anonymous Inner class 형식 : 재사용이 불가능
//		AInterface a = new AInterface() {
//			
//			@Override
//			public void aa() {
//				System.out.println("Anonymous call...");
//			}
//		};
//		a.aa();
		
//		3. 람다식 - @FunctionalInterface인경우만 가능
		AInterface a = () -> System.out.println("람다식 예제...");
		
		a.aa();
		System.out.println();
		
		BInterface b = z -> {
			System.out.println(z);
			System.out.println("인수가 하나 있는 람다..");
		};
		b.bb(13);
		System.out.println();
		
		CInterface c = (i,j) -> i + j;
		
		int re = c.cc(4, 6);
		System.out.println("re = "+re);
		
		
	}
}

///////////////////////////////////////  

class Test implements AInterface{
	
	@Override
	public void aa() {
		System.out.println("되니?");
		
	}
}