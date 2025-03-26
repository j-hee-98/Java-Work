package ex0221.constructor;

/**
 * 생성자를 왜 만들?
 * - 객체가 생성될 때 자동으로 호출되고 딱 한번만 실행된다.
 * - 객체가 생성될 때 해야 할 일 있다면 호출하지 않아도 자동으로
 * 호출될 수 있는 생성자에서 하면 좋다
 * - 딱 한번만 일을 해야하는 경우 쓴다.
 * ex) 초기치데이터 로딩, 환경설정
 * - 주로 필드를 초기화 하는 작업에 많이 쓴다
 */

class Puppy3{
	/*String 타입 전역 변수 선언
	  int 타입 전역 변수 선언*/
	String name;
	int age;
		
	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	public Puppy3() {
		this.name = "메리";
		System.out.println("public Puppy3()호출되었습니다.");
		System.out.println("기본 생성자 : "+name);
		System.out.println("기본 생성자 : "+age);
		System.out.println();
	}
	
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	public Puppy3(String name) {
		this.name = name;
		System.out.println("public Puppy3()호출되었습니다");
		System.out.println("인수 1개 생성자 : "+this.name);
		
		System.out.println("인수 1개 생성자 : "+age);
		System.out.println();
	}
		
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/
	public Puppy3(String name, String addr) {
		this(name+addr);
		System.out.println("public Puppy3()호출되었습니다.");
		System.out.println();
	}
		
	
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/					
	public Puppy3(boolean i) {
		this("쫑"+i);
		System.out.println("public Puppy3()호출되었습니다.");
		System.out.println();
	}
	
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/			
	public Puppy3(char ch) {
		this();
		this.age = ch;
		System.out.println("public Puppy3()호출되었습니다.");
		System.out.println("인수 없는 생성자 호출 값 : "+age);
		System.out.println();
	}
	
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
	public void printMemberVariable() {
		System.out.println("전역변수 name: "+name+", 전역변수 age: "+age);
	}

	
}

public class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){
			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			Puppy3 a = new Puppy3();
			Puppy3 b = new Puppy3("흰둥이");
			Puppy3 c = new Puppy3("흰색", "흰둥이");
			Puppy3 d = new Puppy3(true);
			Puppy3 e = new Puppy3('A');
			
	
			
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			a.printMemberVariable();
			b.printMemberVariable();
			c.printMemberVariable();
			d.printMemberVariable();
			e.printMemberVariable();
			
	}
}