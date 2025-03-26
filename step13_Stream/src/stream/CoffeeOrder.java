package stream;

import java.util.List;
import java.util.stream.Collectors;

public class CoffeeOrder {

	public static void main(String[] args) {
		/**
		 * 1. 아침에 들어온 모든 커피 주문 목록을 List에 coffes라는 이름으로 담는다.
			2. 1을 소스로 스트림을 생성한다. 
			3. 이 커피들을 기본 정렬을 하면 고객이 주문한 순서와 일치한다.
			   주문 들어온 커피 목록 중에서 알파벳 “ o” 로 끝나는 커피가 가장 먼저 들
			어온 주문이다. 
			4. 마지막으로 중복을 제거한 다음 커피들을 모아서 최종 출력한다.

		 * */
		
		List<String> coffees=  List.of(
									"Cappuccino",
									"Americano",
									"Espresso",
									"Caramel Macchiato",
									"Focha",
									"Cappuccino",
									"Espresso",
									"Batte"				
								);
		// "o"로 끝나는 커피들을 우선적으로 정렬
		List<String> res = coffees.stream()
		.filter(c -> c.endsWith("o"))
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		
		// "o"로 끝나지 않는 커피 정렬
		res.addAll(coffees.stream()
				.filter(c -> !c.endsWith("o"))
				.distinct()
				.sorted()
				.collect(Collectors.toList()));
	
		res.forEach(System.out::println);
		
		System.out.println("\n----강사님 풀이---\n");
		
//		List<String> result = coffees.stream()
//				.sorted()
//				.distinct()
//				.collect(Collectors.toList());
//		
//		List<String> coffeeEnd = coffees.stream()
//				.sorted()
//				.sorted((o1, o2) -> {
//					if (o1.endsWith("o") && !o2.endsWith("o")) {
//						return 1;
//					} else if (o1)
//				})
		
		
		
	}

}
