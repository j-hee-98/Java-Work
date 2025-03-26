package ex0219.array;

public class ArgsExam {

	public static void main(String[] args) {
		
		System.out.println("**메인 시작하기**");
		System.out.println();
		
		System.out.println("args = "+ args);
		System.out.println("args.length = "+ args.length);
		System.out.println();
		
		// 전달된 값을 출력
		for(int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"] = "+args[i]);
		}
		System.out.println();
		
		for(String v: args ) {
			System.out.print(v+" ");
		}
		
		// 만약 인수로 숫자 두 개 전달된다고 가정하고 두 수의 합 구한다.
		// 문자열 -> 숫자로 변환 -> Integer.parseInt(문자열);
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		
		System.out.println(no1 + no2);
		System.out.println("**메인 끝**");
	}
}
