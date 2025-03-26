package ex0305;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileExam {

	public FileExam() throws IOException{
		String path = JOptionPane.showInputDialog("파일 경로는?");
		System.out.println("path = "+path);
		
		File file = new File(path);
		if (file.exists()) {
			// 정보 조회
			System.out.println(path+"있습니다.");
			
			// 폴더인지 파일인지 물어보기 가능
			if (file.isDirectory()) {
				System.out.println(path+"폴더 정보 확인****");
				
				// 폴더안에 있는 모든 파일 or 폴더 정보 조회
				String names [] = file.list();
				for (String name : names) {
					System.out.println(name);
				}
			}else {
				System.out.println(path+"파일에 대한 정보 확인****");
				System.out.println("file.length = "+file.length());
				System.out.println("file.getName = "+file.getName());
				System.out.println("file.canRead = "+file.canRead());
				System.out.println("file.canWrite = "+file.canWrite());
				System.out.println("file.lastModified = "+file.lastModified());
			}
			
			
			
			
		} else {
			// 생성
			System.out.println(path+"없으므로 만들께요^^");
			// 파일 생성
//			file.createNewFile();
			// 폴더 생성
			file.mkdir();
		}
	}
	
	public static void main(String[] args) throws IOException {
		new FileExam();
	}
}
