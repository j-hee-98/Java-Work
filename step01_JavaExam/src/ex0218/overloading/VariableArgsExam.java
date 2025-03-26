package ex0218.overloading;

public class VariableArgsExam {

	// ... : int형 인수 0개 이상 허용
	public void test(int ... params) {
		System.out.println(params); // 배열
		
		for(int index=0; index < params.length; index++) {
			System.out.print(params[index]+" ");
		}
		
		System.out.println("=================");
	}
	
	public void test2(Object ... objects) { // 자바의 모든 타입이 0개 이상 허용
		System.out.println(objects);
		
		for(int index = 0; index < objects.length; index++) {
			System.out.println(objects[index]);
		}
	}
	
	public void test3(String name, int ... params) {
		// ... 첫번 째 인수에만 사용 가능, 두 번 사용 불가능
		
	}
	
	public static void main(String[] args) {
		
		VariableArgsExam va = new VariableArgsExam();
		va.test(4);
		
		va.test(4, 3, 5);
		va.test(4, 5, 1, 2, 3, 4);
		System.out.println("*************");
		
		va.test2("안녕");
		va.test2();
		va.test2("배고프다", 10, true, 4.5);
		
	}
}
