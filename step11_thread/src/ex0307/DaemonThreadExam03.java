package ex0307;

public class DaemonThreadExam03 {

	public static void main(String[] args) {
		System.out.println("***메인 시작합니다.***");
		
		Thread th = new Thread(()->{
			while(true) {
				System.out.println("점심 메뉴는?");
				
			}				
			
		});
		//	메인스레드가 종료될때 th 스레드가 함께 종료된다.. 
		th.setDaemon(true);
		
		th.start();
		
		// 3초가 지나면 스레드를 멈추게 하고 싶다..
		try {
			Thread.sleep(3000);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("***메인 종료합니다.***");
	}
}
