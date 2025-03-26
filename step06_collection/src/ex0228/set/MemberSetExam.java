package ex0228.set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {

	Set<Member> set = new HashSet<Member>();
	
	public MemberSetExam() {
		set.add(new Member("둘리", 20, "서울"));
		set.add(new Member("둘리", 22, "대구"));
		set.add(new Member("둘리", 20, "부산"));
		
		System.out.println("저장된 객체의 개수 = "+set.size());
	}
	
	public static void main(String[] args) {
		
		new MemberSetExam();
	}
}