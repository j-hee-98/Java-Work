package lamda.methodRef;
import java.util.function.BiFunction;

public class SpecificInstanceMethod03 {
	public static void main(String[] args) {
		//기존방식
		BiFunction<String, String, Boolean> beforeEquals = new BiFunction<String, String, Boolean>() {
			
			public Boolean apply(String t, String u) {
				return t.equals(u);
			};
		};
	
		// 람다식방식
		BiFunction<String, String, Boolean> lambdaEquals = (s1, s2) -> s1.equals(s2);
		
		//메소드 참조방식
		BiFunction<String, String, Boolean> methodRefEquals = String::equals;
		
		System.out.println(beforeEquals.apply("heejung", "heejung")); // true
		System.out.println(lambdaEquals.apply("Java", "Java")); // true
		System.out.println(methodRefEquals.apply("Java", "Python")); // false
	}
}
