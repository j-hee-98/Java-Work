package ex0228.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam03 {
	
	private List<Emp> list = new ArrayList<>();
	
	/**
	 * 생성자를 이용해서 5명 정도 데이터(사원) 추가
	 */
	public ListExam03() {
		list.add(new Emp(10, "장희정", 22, "서울"));
		list.add(new Emp(23, "이나정", 11, "부산"));
		list.add(new Emp(15, "이효리", 44, "대구"));
		list.add(new Emp(34, "삼순이", 33, "서울"));
		list.add(new Emp(76, "삼식이", 16, "부산"));
		
//		System.out.println(list);
	}
	
	/**
	 * 저장된 모든 사원정보 리턴 (출력)
	 */
	public List<Emp> selectAll() {
		
		return list;
	}
	
	/**
	 * 
	 * 사원번호에 해당하는 사원정보 리턴
	 */
	public Emp selectByEmpno(int empno) {
		
		for(int i = 0; i < list.size(); i++) {
			Emp emp = list.get(i);
			if (emp.getEmpno() == empno) {
				return emp;
			}
		}
		return null;
		
//		for (Emp e : list) {
//			if (e.getEmpno() == empno) return emp;
//		}
		
	}
	
	/**
	 * 주소를 인수로 전달받아 동일한 주소의 사원들 검색
	 */
	public List<Emp> selectByAddr(String addr) {
		
		List<Emp> n = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			Emp emp = list.get(i);
			if (emp.getAddr().equals(addr)) {
				n.add(emp);
			}
		}
		
		return n;
	}
	
	/**
	 * 사원번호를 기준으로 정렬 - Comparable
	 */
	public List<Emp> sortEmpno() {
		
		List<Emp> shallowCopy = new ArrayList<Emp>(list);
		System.out.println("-----------------------");		
		Collections.sort(shallowCopy);
		System.out.println("-----------------------");
		
		return shallowCopy;
	}

	/**
	 * 나이를 기준으로 정렬 - Comparator
	 */
	public List<Emp> sortByAge() {
		
		List<Emp> shallowCopy = new ArrayList<Emp>(list);
		
//		1. 외부에 구현객체를 정의
//		Collections.sort(shallowCopy, new sortTest());
		
//		2. 익명이너클래스
//		Collections.sort(shallowCopy, new Comparator<Emp>() {
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				
//				return o1.getAge() - o2.getAge();
//			}
//		});
		// 3. 람다식
		Collections.sort(shallowCopy,
				(o1, o2) -> o1.getAge() - o2.getAge() );
		
		
		return shallowCopy;
	}
	
	public static void main(String[] args) {
		
		ListExam03 e = new ListExam03();
		
		System.out.println("1. 사원번호 검색");
		Emp emp = e.selectByEmpno(10);
		System.out.println("emp = "+ emp);
		
		System.out.println("2. 동일한 주소 검색");
		List<Emp> foundList = e.selectByAddr("서울");
		System.out.println("개수 = "+foundList.size());
		if (foundList.isEmpty()) {
			System.out.println("찾는 주소가 없습니다.");
		} else {
			System.out.println("foundList = "+ foundList);			
		}
		
		System.out.println("3. 사원번호를 기준으로 정렬");
		List<Emp> list = e.sortEmpno();
		for (Emp ee : list) {
			System.out.println(ee);
		}
		System.out.println();
		System.out.println("----4.----나이로 정렬----------");
		list = e.sortByAge();
		for (Emp ex : list) {
			System.out.println(ex);
		}
	}
}


//class sortTest implements Comparator<Emp> {
//
//	@Override
//	public int compare(Emp o1, Emp o2) {
//		
//		return o1.getAge() - o2.getAge();
////		return o2.getAge() - o1.getAge();
//	}
//}