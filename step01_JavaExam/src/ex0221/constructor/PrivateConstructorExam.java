package ex0221.constructor;

/**
 * 싱글톤 클래스 작성법
 * 1) private 생성자 만든다
 * 2) static 멤버필드를 이용해서 자신을 생성한다.
 * 3) 멤버필드 (현재클래스 생성한 필드)를 리턴해주는 메소드 제공 static 
 */

class Test {
	
	private static Test t = new Test();
	// 외부에서 직접 객체 생성 못한다.
	private Test() {}
	
	/**
	 * 현재 클래스를 직접 생성해서 리턴해주는 메소드를 제공
	 */
	public static Test getInstance() {
		
		return t;
	}
	
}


public class PrivateConstructorExam {
	
	public static void main(String[] args) {
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		System.out.println("t1 = "+t1);
		System.out.println("t2 = "+t2);
	}
}
