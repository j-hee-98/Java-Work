package ex0217.homework;

public class Exercise15 {
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		System.out.println(result);
		System.out.println();
		
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}

	
}

class MemberService {
	
	// id가 "hong", password가 "12345"일 경우에만 true로 리턴
	public boolean login(String id, String password) {
		
		if (id == "hong" && password == "12345") return true;
		return false;

	}
	
	
	void logout(String id) {
		
		System.out.println(id+"님이 로그아웃 되었습니다.");
		
	}
}
