package ex0307;

public class InterruptedExam01 {

	public static void main(String[] args) {
		System.out.println("***메인 시작합니다.***");
		
		Thread th = new Thread(()->{
			try {
				while(true) {
					System.out.println("점심 메뉴는?");
					
					Thread.sleep(1);
				}				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		th.start();
		
		// 3초가 지나면 스레드를 멈추게 하고 싶다..
		try {
			Thread.sleep(3000);
			
			// 잠시라도 일시 정지 상태가 되어야 interrupt를 감지하고 InterutedException가 발생된다.
			th.interrupt(); // 스레드를 InterutedException을 발생시킨다.
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("***메인 종료합니다.***");
	}
}
