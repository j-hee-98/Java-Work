package ex0228.list;

import java.util.Collections;
import java.util.Vector;

//public class ListExam01 extends ArrayList<Integer>{
public class ListExam01 extends Vector<Integer>{

	public ListExam01() {
		super(5);// 5개의 공간으로
		
		// 부모의 메서드 사용 : 생략, super, this
		add(10);	// autoBoxing
		this.add(19);
		super.add(12);
		add(3);
		add(44);
		add(22);
		add(11);

		// list에 저장된 요소의 개수
		int size = super.size();
		System.out.println("저장된 요소의 개수 = "+size);
		
		// 출력
		for (int i = 0; i < size; i++) {
			int v = super.get(i); // unBoxing
			System.out.println("v = "+v);
		}
		
		// 요소 제거
		remove(2);
		
		// 개선된 for
		for (int v : this) {
			System.out.println(v+" ");
		}
		
		System.out.println("this = "+this);
		System.out.println("this = "+this.toString());
		
		// 요소를 정렬
		Collections.sort(this);
		
		// 정렬 후
		for (int v : this) {
			System.out.print(v+" ");
		}
		System.out.println();
		
		// 요소를 정렬 (내림차순)
		Collections.sort(this, Collections.reverseOrder());
		
		// 정렬 후
		for (int v : this) {
			System.out.print(v+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		new ListExam01();
		
	}
}
