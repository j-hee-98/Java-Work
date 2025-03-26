package stream.ex01;

import java.util.Arrays;
import java.util.List;

public class ParalleStreamExam01 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David"
				, "Charlie", "David", "Charlie", "David", "Charlie", "David", "Charlie", "David");
		
		// 기존방식
		for (String name : names) {
			if (name.startsWith("C")) {
				System.out.println(Thread.currentThread().getName() + " - " + name);
		 	}
		}
		System.out.println("===stream===");
		// names.stream() 기
		names.parallelStream()	//병렬 처리
		 .filter(name -> name.startsWith("C"))
		 .forEach(name ->
		 System.out.println(Thread.currentThread().getName() + " - " + name)
		 );
		
	}
}
