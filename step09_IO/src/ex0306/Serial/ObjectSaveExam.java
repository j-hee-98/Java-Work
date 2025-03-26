package ex0306.Serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectSaveExam {

	public ObjectSaveExam() {
		// 객체를 파일에 저장 - ObjectOutputStream 사용
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/ex0306/Serial/objSave.txt", true)) ) {
			
			Student st1 = new Student("나영", 30, "서울");
			Student st2 = new Student("효리", 20, "부산");
			Student st3 = new Student("둘리", 10, "대구");
			
			List<Student> list = List.of(
					new Student("둘리", 10, "대구"),
					new Student("미미", 22, "제주도"),
					new Student("호호", 23, "서울"));
			
			// 저장 실패 - 직렬화를 해야지 저장이 됨
			
			oos.writeObject(st1);
			oos.writeObject(st2);
			oos.writeObject(st3);
			oos.writeObject(list);
			
			System.out.println("저장완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ObjectSaveExam();
	}
}
