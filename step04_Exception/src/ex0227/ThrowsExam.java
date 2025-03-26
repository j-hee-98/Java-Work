package ex0227;

public class ThrowsExam {
	// 3. aa 도 예외 처리하기 싫으면 예외처리 + 처리할 것이 많으면 콤마로 찍어줄 수 있다.
	public void aa(int i) throws ArithmeticException, NullPointerException{
		System.out.println("aa call");
		// throws로 던진 것을 처리
		//try {
			this.bb(i);
		//} catch (ArithmeticException e) {
		//	System.out.println("예외 발생 = " + e.getMessage());
		//}
		System.out.println("aa end");
	}
	
	// 2. throws 로 처리해줘
	public void bb(int i) throws ArithmeticException {
		System.out.println("bb call");
		
		try {
		// 1. 직접 예외 처리(try-catch)
		/*try {/**/
			int result = 100 / i;   // 0이 들어오면 문제가 생김 (//ArithmeticException 가능성)
			System.out.println("나눈 결과: " + result); // 결과 값도 같이 넣어 줘야.
			
//		}	catch (ArithmeticException e) {
//			System.out.println("나눌 수 없어요.");
//		}*/
		
		} finally {	
			// 2-2.finally 로 꼭 해줘야 한다.(이건 꼭 실행해줘야 하기 때문) -> finally 사용하려면 try는 있어야 한다.	
			System.out.println("bb end");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("**메인 시작**");
		ThrowsExam te = new ThrowsExam();
		try {
			te.aa(0);
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("오류가 발생했어요~");
		}
		System.out.println("**메인 끝**");
	}
}
