package ex0306;

public class ThreadExam {

	public static void main(String[] args) {
		System.out.println("***메인 시작합니다***");
		
		// 1 ~ 100까지 출력
		NumberThread th1 = new NumberThread("첫번째 스레드");
		NumberThread th2 = new NumberThread("두번째 스레드");
		
		// A~Z 출력
		Thread th3 = new Thread(new AlphaThread(), "세번째 스레드");
		
		th1.start();
		th2.start();
		th3.start();
		
//		try {
//			th1.join();		// th1 스레드가 일을 맡칠 때까지 메인 스레드는 일시정지 상태
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("th1.sum = "+th1.sum);
		System.out.println("***메인 종료합니다***");
	}
}

/**
 * 1~ 100까지 출력하는 스서드
 */
class NumberThread extends Thread {
	int sum = 0;
	public NumberThread(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(super.getName()+"=>"+i);
			
			sum+=i;	// 누적
			
//			int time = (int)(Math.random()*500);
//			try {
//				Thread.sleep(time); 	// 일시정지상태
//				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		System.out.println(super.getName() +"스레드 종료합니다. = "+sum);
	}
}

/**
 * A ~ Z 출력하는 스레드
 */
class AlphaThread implements Runnable {	
	@Override
	public void run() {
		// 현재 동작하고 있는 스레드가 누구인지 가져오기
		Thread th = Thread.currentThread();
		
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.println(th.getName()+"=>"+ch);
			
//			int time = (int)(Math.random()*500);
//			try {
//				Thread.sleep(time); 	// 일시정지상태
//				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			Thread.yield();  // 양보 (실행 중인 상태를 Runnable 상태로 만든다)
		}
		System.out.println(th.getName()+"스레드 종료합니다.");
	}
}