package ex0224.overridingEx;


class ObjectExam{
	
	private String str;
	public ObjectExam(){   }
	
	public ObjectExam(String str){
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str + "=" + super.toString();
	}
}

class ReferenceExam{
	
	public static void main(String[] args) {
		
			char c='a';
			
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");
			
			ObjectExam oe1=new ObjectExam("배고파");
			ObjectExam oe2=new ObjectExam("안녕");
			
			System.out.println(c);//a
			
			/**
			 * print(Object obj) or println(Object obj)
			 *  : 인수로 전달된 obj.toString()메소드를 자동으로 호출하고
			 *    그 toString()이 리턴하는 문자열을 모니터에 출력
			 *    
			 * s01, s02, s03의 값이 주소값으로 나오지 않은 이유
			 *  : String 안에 toString 메서드가 오버라이딩 되있다.
			 */
			
			System.out.println(s01);//장희정
			System.out.println(s02);//Java
			System.out.println(s03);//월요일
			
			System.out.println(oe1);//주소값 -> 졸지말자
			System.out.println(oe2);//주소값 -> 졸지말자
			
	}
}