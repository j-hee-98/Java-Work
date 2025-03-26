package ex0221.homework;

/**
 * chapter6 - 15번 문제
 *  MemberService 클래스에 login(), logout() 메소드 선언
 *  
 *  - login() 메서드는 매개값 id가 "hong", 매개값 password가 "12345" 일 경우에만 true로 리턴
 *  - logout() 메서드는 id + "님이 로그아웃 되었습니다"가 출력되도록 할 것
 *  
 *  id.equals("hong") && password.equals("12345")
 *  "hong".equals(id) && "12345".equals(password)
 *  두 개의 값은 같지만 두번째 코드를 더 권장 : 인수로 들어오는 값이 null 값일수도 있으니 
 *  
 */

class MemberService {
	
	public boolean login(String id, String password) {
		if ("hong".equals(id) && "12345".equals(password)) {
			return true;
		}
		return false;
	}
	
	public void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}
}

public class Exercise15 {
	
	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		
		boolean result = ms.login("hong", "12345");
		
		if (result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
	
}
