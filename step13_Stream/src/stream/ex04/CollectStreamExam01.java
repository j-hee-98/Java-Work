package stream.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectStreamExam01 {

	public static void main(String[] args) {
		
		List<Student>totalList= new ArrayList<>();
		totalList.add(new Student("장희정", "남", 92));
		totalList.add(new Student("하승현", "여", 87));
		totalList.add(new Student("오문정", "남", 95));
		totalList.add(new Student("김은영", "여", 93));
		
		//학생들 중 남학생만 뽑아 새로운 List로 만들기
		List<Student> manList = totalList.stream()
		.filter(m -> m.getGender().equals("남"))
		.collect(Collectors.toList());
		
		manList.add(new Student("삼식이", "남", 85));	// 새로운 데이터 추가
		
		manList.stream().forEach(System.out::println);
		
		System.out.println("\n====collect() 대신 toList() 사용해보자\n");
		
		List<Student> manList2 = totalList.stream()
				.filter(m -> m.getGender().equals("남"))
				.toList();
		
//		manList2.add(new Student("삼식이", "남", 85));	// toList()를 사용하면 추가가 안된다.
		
		manList2.stream().forEach(System.out::println);
		
		System.out.println("\n===toMap<k, V> 사용===\n");
		
		//학생들 정보를 이름을 key, 점수를 value로 만들어서 Map으로 리턴
		Map<String, Integer> map = totalList.stream()
		.collect(Collectors.toMap(Student::getName, Student::getScore));	// 메소드 참조 방식
//		.collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		
		System.out.println(map);
	}
}
