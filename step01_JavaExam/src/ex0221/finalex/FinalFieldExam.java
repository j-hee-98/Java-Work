package ex0221.finalex;

public class FinalFieldExam {
	int i;
	final int j;	// final 필드는 반드시 초기화(명시적 초기화 + 생성자를 이용한 초기화)
	static final int k;	// 상수 반드시 초기화
	
	static {
		k=0;
	}
	
	public FinalFieldExam(int value){
		this.j = value;
//		k = value;
	}
	
	public void test() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		i = 100;
//		j = 10;		// 값 변경 불가
//		k = 50;		// 값 변경 불가
	}

	public static void main(String[
	                               ] args) {
		FinalFieldExam ffd = new FinalFieldExam(100);
		ffd.test();
	}
}
