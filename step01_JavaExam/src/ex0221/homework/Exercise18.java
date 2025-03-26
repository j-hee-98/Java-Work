package ex0221.homework;

/**
 * chapter06 - 18번 문제
 * ShopService 클래스를 작성
 * 
 * 싱글톤 클래스 작성
 * 1) private 생성자
 * 2) static(정정)멤버필드를 선언해서 자기자신 생성
 * 3) static 메소드에서 정적필드 리턴
 */

class ShopService {
	
	private static ShopService instance;
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		if (instance == null) {
			instance = new ShopService();
		}
		return instance;
	}
}

public class Exercise18 {
	
	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopSerivce 객체입니다.");
		}
	}
}
