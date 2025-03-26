package ex0227.homework.ex08;

/**
 * AutoCloseable을 구현하면
 * close() 메서드를 자동으로 호출 해줌
 * 그래서 try ( 변수 )
 */

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		try ( FileWriter fw = new FileWriter("file.txt") ) {
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
