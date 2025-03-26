package ex0224.homework;

/**
 * chapter07 - 6번 문제
 * 컴파일 에러가 발생한 이유
 */

/**
 * Child 클래스에서 접근 제어자 public을 삭제
 */

public class Parent {

	public String name;
	
	public Parent() {}
	
	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent {
	
	public int studentNo;
	
	public Child(String name, int studentNo) {
		this.name = name;
		this.studentNo = studentNo;
	}
}
