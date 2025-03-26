package ex0224.homework;

/**
 * 교재 p288
 * phone, smartphone
 */
class Phone {
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기 : "+message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 : "+message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}

class SmartPhone extends Phone {
	
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;	
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}


public class SmartPhoneExample {
	
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("갤럭시","은색");
		
		System.out.println("모델 : "+sp.model);
		System.out.println("색상 : "+sp.color);
		
		System.out.println("와이파이 상태: "+sp.wifi);
		
		sp.bell();
		sp.sendVoice("여보세요");
		sp.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		sp.sendVoice("아~ 네, 반갑습니다.");
		sp.hangUp();
		
		sp.setWifi(true);
		sp.internet();
	}
}
