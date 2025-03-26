 package ex0221.constructor.student;

/**
 * 각 요청의 결과를 모니터에 출력을 담당하는 클래스
 */
public class StudentEndView {
	
	StudentService service = new StudentService();
	Student st = new Student();
	/**
	 * 전체검색 결과 출력
	 */
	public static void printSelectAll(Student [] stArr) {
		// stArr[i]를 출력하면 주소의 값만 나오기 때문에 .getName(0) 등으로 값을 보여주는거다.
		for (int i = 0; i < StudentService.count; i++) {
			System.out.println("이름은 "+stArr[i].getName()+" 나이 : "+stArr[i].getAge()+" 주소 : "+stArr[i].getAddr());
		}
		System.out.println();
	}
	
	/**
	 * 조건 검색 결과 출력 ( 이름에 해당하는 학생정보 출력 )
	 * stArr 배열을 돌면서 if 문에서 이름을 뽑아서 희정이와 같은
	 * 것이 있으면 학생정보 출력
	 */
	public static void printSelectByName(Student student) {
		System.out.println("이름은 "+student.getName()+" 나이 : "+student.getAge()+" 주소 : "+student.getAddr());
			
	}
	
	/**
	 * 성공 or 실패 메시지 출력 (등록 or 수정)
	 */
	public static void printMessage(String message) {
		
		System.out.println(message);
	}
	
}
