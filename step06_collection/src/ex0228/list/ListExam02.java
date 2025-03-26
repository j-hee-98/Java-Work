package ex0228.list;

import java.util.ArrayList;
import java.util.List;

//public class ListExam01 extends ArrayList<Integer>{
public class ListExam02 {
//	ArrayList<Integer> list = new ArrayList<Integer>(); // 확장성의 문제가 됨
	List<Integer> list = new ArrayList<Integer>(5);

	public ListExam02() {
		
		// 부모의 메서드 사용 : 생략, super, this
		list.add(21);
		list.add(31);
		list.add(41);
		list.add(24);
		list.add(25);
		list.add(12);
		list.add(15);
		
		// list에 저장된 요소의 개수
		int size = list.size();
		System.out.println("저장된 요소의 개수 = "+size);
		
		// 출력
		for (int i = 0; i < size; i++) {
			int v = list.get(i); // unBoxing
			System.out.println("v = "+v);
		}
		
		// 요소 제거
		list.remove(2);
		
		// 개선된 for
		for (int v : list) {
			System.out.println(v+" ");
		}
		
		System.out.println("this = "+this);
		System.out.println("this = "+this.toString());
	}
	
	
	public static void main(String[] args) {
		
		new ListExam02();
		
	}
}
