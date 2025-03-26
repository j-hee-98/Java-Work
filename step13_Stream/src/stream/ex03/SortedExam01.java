package stream.ex03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import stream.ex03.Student;

public class SortedExam01 {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("희정", 22, 80, "컴퓨터"),
				new Student("둘리", 21, 70, "과학"),
				new Student("나영", 20, 30, "국어"),
				new Student("미미", 30, 88, "컴퓨터"),
				new Student("효경", 50, 70, "수학"),
				new Student("삼식", 43, 90, "영어")
		);
		
		System.out.println("--------점수기준으로 오름차순--------");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("--------점수기준으로 내림차순--------");
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		
		System.out.println("-------나이를 기준으로 정렬--------");
		list.stream()
//		.sorted((s1, s2)-> s1.getAge() - s2.getAge())
//		.sorted((s1, s2)-> s2.getAge() - s1.getAge())
		.sorted(Comparator.comparingInt(Student::getAge))
		.forEach(System.out::println);
	}
}
