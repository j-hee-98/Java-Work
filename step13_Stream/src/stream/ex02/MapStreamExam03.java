package stream.ex02;

import java.util.Arrays;
import java.util.List;

public class MapStreamExam03 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("희정", 22, 80, "컴퓨터"),
				new Student("둘리", 21, 70, "과학"),
				new Student("나영", 20, 30, "국어"),
				new Student("미미", 30, 88, "컴퓨터"),
				new Student("효경", 50, 70, "수학"),
				new Student("삼식", 43, 90, "영어")
				);
		
		// 전체 출력
		list.stream().forEach(System.out::println);
		
		System.out.println();
		// 점수만 출력
		list.stream()
		.mapToInt(Student :: getScore)	// 메소드 참조로도 가능
//		.mapToInt(t -> t.getScore())
		.forEach(System.out::println);
		
		// 점수의 총점
		int sum = list.stream()
		.mapToInt(Student :: getScore)
		.sum();
		System.out.println("총점 : "+sum);
		
		// 점수의 평균
		double avg = list.stream().mapToInt(Student::getScore).average().orElse(0.0);
		System.out.println("평균 : "+avg);
		
		long count = list.stream().mapToInt(Student::getScore).count();
		System.out.println("인원 수 : "+count);
		
		System.out.println();
		
		// 점수가 80점 이상인 학생들의 이름만 검색
		list.stream()
//		.map(s->s.getName())
		.filter(s -> s.getScore() >= 80) 	// Stream<Student>
		.map(Student::getName)				// Stream<String>
		.forEach(System.out::println);
		
	}
}
