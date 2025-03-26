package ex0227.exceptionExam;

/**
 * 나이가 18보다 작을 때 발생시킬 예외 클래스
 * Exception : 체크예외 이므로
 * RuntimeException : 비체크예외
 */

public class NoKidsException extends Exception{
	
	static int count;

	public NoKidsException() {
		super("애들은 안돼요");
		count++;
	}
	
	public NoKidsException(String message) {
		super(message);
		count++;
	}
}
