package ex0306;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {
	public BufferedReaderWriterExam() {
		// 문자단위로 파일 읽기 --> 보조스트림인 성능을 위한 Buffered 추가(노드 스트림이 반드시 있어야한다.)
		try(BufferedReader br = new BufferedReader(new FileReader("src/ex0306/read.txt"));
			// 4-1. 여기에 true 를 지정하면 이어쓰기 형태가 되어서 계속 이어쓴다.	
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0306/write.txt", true))){
			// 1. 어제는 못 보았던 BufferedReader에는 readline이 있다-> 지금 이건 한개 밖에 못읽음
			/*int i = br.read();
			System.out.println(i);*/
			
			// 2. 한 문자씩 밖에 못읽는다 -> 한 문자씩 일때 더이상 읽을 것이 없으면 -1
			/*while (true) {
				int i = br.read();
				if (i == -1) {
					break;
				}
				System.out.println(i + ", " + (char)i);
			}*/
			
			// 3. 한 줄씩 읽을 때는 readLine + 더 이상 읽을 것이 없다면 null 
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
			
			// 4. 문자 단위 파일에 저장 -> writer(writer는 덮어 쓰기가 된다.)
			System.out.println(" 문자 단위 파일에 저장 ");
			bw.write(65);
			bw.write("곧 쉬어요~");
			bw.newLine(); // 13, 10대신 개행
			bw.write("참 쉬어요~~");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new BufferedReaderWriterExam();
	}

}
