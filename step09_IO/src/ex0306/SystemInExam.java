package ex0306;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInExam {
	public static void main(String[] args) throws Exception{
		// 1. 키보드 입력을 받을 수 있도록 InputStream 객체를 생성한다.
	    // System 클래스 안에는 `static final InputStream in` 이라는 필드가 존재한다.
	    // 즉, System.in은 표준 입력(키보드 입력)을 나타내는 InputStream 객체이다.
	    // 따라서 InputStream 타입의 변수 is 에 System.in을 할당하면 키보드 입력을 받을 수 있다. 
		InputStream is = System.in;
		/*int i = is.read();                              // 1byte씩 읽기
		System.out.println(i + " = " + (char) i);*/
		
		// 2. byte 단위(InputStream) 처리를 -> 문자단위(Reader) 처리 변환 -> Buffered 이용
		InputStreamReader isr = new InputStreamReader(is);     
		/*int i = isr.read();                               // 1문자씩 읽기
		System.out.println(i + " = " + (char) i);*/
		
		// 3. 문자단위 말고 한줄씩 읽고 싶어요 -> Buffered 의 메소드에는 readLine 이 있다.
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		System.out.println("data = " + data);
		
	}

}
