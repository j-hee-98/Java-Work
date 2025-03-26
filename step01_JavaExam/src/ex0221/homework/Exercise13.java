package ex0221.homework;

/**
 * chapter6 - 13번 문제, 14번 문제 이어서
 * Member 클래스 선언
 */

class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

public class Exercise13 {
	
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		System.out.println(user1.name+","+user1.id);
	}
}
