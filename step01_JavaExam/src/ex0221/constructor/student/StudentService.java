package ex0221.constructor.student;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 * */
public class StudentService {
	
	/**
	 * 학생들의 정보를 저장해서 관리할 배열 필드를 선언
	 */
	private Student stArr [] = new Student [5];
	
	public static int count; // 배열에 저장된 객체의 개수를 체크하는 필드
	
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	public void init() {
		
		stArr[count++] = this.create("희정", 10, "서울");
		stArr[count++] = this.create("햄버거", 30, "대구");
		stArr[count++] = this.create("버거", 20, "부산");
	}
	
	/**
	 *  Student객체를 생성해서 리턴해주는 메소드 작성
	 * */
	 private Student create(String name, int age, String addr) {
		 
//		 Student st = new Student();
//		 st.setName(name);
//		 st.setAge(age);
//		 st.setAddr(addr);
		 Student st = new Student(name, age, addr);

		 return st;
	 }

	 /**
	   학생의 정보 등록하기 
	    : 배열의 경계를 벗어나면 더이상 추가할수 없습니다. 메시지출력.
	      추가가 성공하면 "등록되었습니다" 메시지를 출력
	      
	      @return : int
	      	배열의 길이를 벗어났을 때 : -1
	      	이름이 중복되었을 때 : 0
	      	성공했을 때 : 1
	  **/
	 public int insert(Student student) {
		 
		 if (count == stArr.length) return -1;
		 else if ( this.selectByName(student.getName()) != null) return 0;
		 
		 stArr[count++] = student;
		 return 1;
	 }
	
	/**
	 * 전체 학생의 정보 조회하기
	 * */
	 public Student[] selectAll() {
		 
		 return stArr;
	 }
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소를출력하고
	 *     없으면 "찾는정보가 없습니다." 출력한다.
	 *     
	 *     @return : Student
	 *     			찾으면 찾은 Student 객체를 리턴하고
	 *              못찻으면 null 리턴
	 * */
	 public Student selectByName(String name) {
		 
		 for (int i = 0; i < count; i++) {
			 if (stArr[i].getName().equals(name)) return stArr[i];
		 }
		 return null;
	 }
	 
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 *  : 이름에 해당하는 학생이 있는지 찾아서 없으면 "수정할수 없습니다." 출력
	 *   있으면  setAge() , setAddr() 이용해서 전달된 인수의 값으로 변경하고
	 *   "수정되었습니다" 출력
	 *   @param : Student
	 *   @return : boolean
	 *   		수정되었으면 true, 수정되지 않으면 false
	 * */		
	 public boolean update(Student student) {
		 
		 Student searchSt = this.selectByName(student.getName());
		 if (searchSt == null) return false;
		 
		 searchSt.setAge(student.getAge());
		 searchSt.setAddr(student.getAddr());
		 return true;
	 }
	 

}

