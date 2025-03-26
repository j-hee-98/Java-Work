package ex0224.superkeyword;

class Parent {
	
//	Parent() {
//		System.out.println(1);
//	}
	Parent(int i) {
		System.out.println(2);
	}
	Parent(String s) {
		System.out.println(3);
	}
}

class Child extends Parent{
	
	Child() {
//		super() // 생략되어있음
		super(3);
		System.out.println(4);
	}
	
	
	Child(int i) {
		super(i);
		System.out.println(5);
	}
	Child(boolean b) {
		super("안녕");
		System.out.println(6);
	}
}

public class SuperConstructorExam {
	
	public static void main(String[] args) {
//		new Child();
//		new Child(6);
//		new Child(false);
		// 정리 : 자식생성자 구현부 첫번째 줄에 super() 생략되어있다.
		// 자식이 인수가 있는 생성자를 호출해도 무조건 부모의 기본생성자를 호출한다.
		
		// 만약 1, 2, 3이 없다면
//		new Child();
//		new Child(6);
//		new Child(false);
		// 정리 : 부모에 생성자를 하나도 작성하지 않으면 자동으로 기본 생성자 만들어진다.
		
		//만약 1은 없고, 2,3만 있다면
		new Child();
		new Child(6);
		new Child(true);
		// 정리 : 반드시 자식생성자 구현부 첫번째 줄에서 다른 생성자를 직접 호출해야 한다.
	}
}
