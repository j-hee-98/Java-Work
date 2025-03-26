package stream.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import stream.ex02.Student;

public class MatchStreamExam02 {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("희정", 22, 80, "컴퓨터"),
				new Student("둘리", 21, 70, "과학"),
				new Student("나영", 20, 30, "국어"),
				new Student("미미", 30, 88, "컴퓨터"),
				new Student("효경", 50, 70, "수학"),
				new Student("삼식", 43, 90, "영어")
		);
		
		//allMatch - 모든 학생의 점수가 80점 이상이지?
		boolean re = list.stream().allMatch(s-> s.getScore() >= 80);
		System.out.println("allMatch = "+re);
		
		//anyMatch - 학생중에 80점 이상이 한명이라도 있는지?
		re = list.stream().anyMatch(s-> s.getScore() >= 80);
		System.out.println("allMatch = "+re);
		
		//noneMatch - 학생 중에 80점 이상이 아무도 없니?
		re = list.stream().noneMatch(s-> s.getScore() >= 80);
		System.out.println("allMatch = "+re);
		
		
		// max() - 가장 많은 나이
		Student st = list.stream()
		.max((s1, s2) -> s1.getAge() - s2.getAge())
		.orElse(null);
		System.out.println(st);
		
		// min() - 가장 적은 나이
		
		IntStream stream = Arrays.stream(new int [] {1,3,5,6,8});
		int max = stream.max().getAsInt();
		System.out.println("max = "+max);

		stream = Arrays.stream(new int [] {1,3,5,6,8});
		int min = stream.min().getAsInt();
		System.out.println("min = "+min);
		
	}
}
