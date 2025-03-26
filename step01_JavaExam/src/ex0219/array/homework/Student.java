package ex0219.array.homework;

/**
 * 학생이 가질 수 있는 속성(정보) 관리하는 객체
 * : DTO (Data Transfer object()) , vo(Value object)
 */

public class Student {

	private String name;
	private int age;
	private String addr;
	
	// 속성들 사용할 수 있도록 setXxx, getXxx 제공
	/**
	 * setXxx()
	 * : 제한자 : public
	 * : 리턴타입 : void
	 * ; 메소드 이름 : setXxx() -> ex) setName(); 
	 * : 인수 : 필수
	 */
	public void setName(String name) {
		// 기능
		this.name = name;
	}

	public void setAge(int age) {
		if (age < 18) System.out.println("나이를 변경할 수 없습니다.");
		else this.age = age;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	/**
	 * 조회 - getXxx
	 *  : 제한자 : 필수
	 *  : 메소드이름 : getXxx() -> ex) getName())
	 *  : 인수 : 없음
	 */
	public String getName() {
		
		return name +"님";
	}
	
	public int getAge() {
		
		return age;
	}
	
	public String getAddr() {
		
		return addr +"에 살고 있습니다.";
	}
	
	public void printStudentInfo() {
		System.out.print(name+"은 ");
		System.out.print(age+"살이고 ");
		System.out.print(addr+"에 살고 있습니다");
	}
	public static void main(String[] args) {
		Student st = new Student();
		
		st.setName("홍길동");
		st.setAge(20);
		st.setAddr("서울");
		
		st.printStudentInfo();
		
	}
	
}
