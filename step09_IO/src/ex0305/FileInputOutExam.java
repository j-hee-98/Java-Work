package ex0305;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;

public class FileInputOutExam {

	public FileInputOutExam() {
		// byte 단위로 파일 읽기
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
//			fis = new FileInputStream("src/ex0305/test.txt");
			fis = new FileInputStream("src/ex0305/FileExam.java");
//			fis = new FileInputStream("");
			
			/*int i = 0;
			while((i = fis.read()) != -1) {
			// 1byte씩 읽기
				System.out.print("i = "+(char)i+" ");				
			}*/

			int length = fis.available();	// 읽어들일 수 있는 byte수를 리턴
			System.out.println("length = "+length);
			
			byte b [] = new byte [length];
			int i = fis.read(b);	// i는 읽어들인 byte 수 리턴
			System.out.print("i = "+i+" ");				
			
			//byte []을 String으로 변환
			String data = new String(b);
			System.out.println("data = "+data);
			
			//////////// 파일 저장 //////////////
			fos = new FileOutputStream("src/ex0305/write.txt", true);
			fos.write(65);
			fos.write(97);
			fos.write(32);
			fos.write(100);
			fos.write(13);
			fos.write(10);
			
			fos.write(70);
			
			String message = "이제 쉬어요.";
			fos.write(message.getBytes());	// String -> byte 배열로
			fos.flush();
			
		} catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new FileInputOutExam();
		
	}
}
