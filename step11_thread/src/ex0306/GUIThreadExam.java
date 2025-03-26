package ex0306;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIThreadExam extends JFrame{
	
	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);
	JButton btn = new JButton("눌러봐");

	public GUIThreadExam() {
		super("시계~");
		
		// Container의 layout을 변경
		super.setLayout(new FlowLayout());		
		// JFrame 창에 컴포넌트들을 추가한다.
		Container con = super.getContentPane();
		con.add(text1);		// 창의 크기
		con.add(text2);
		con.add(btn);
		;		// 창의 크기
		super.setSize(500, 400);
		// 정중앙에 위치하게
		super.setLocationRelativeTo(null);
		// 창을 보여줘
		super.setVisible(true);
		// 클릭했을 때 창닫기
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 시계 스레드 시작
		new ClockThread().start();
		
		// 텍스트 박스에 숫자 출력 스레드 1~1000
		// 인수로 들어오는 게 함수형 인터페이스 한 개라서 람다식 가능
		// 람다식으로 작성 (inner 클래스라서 text1사용 가능)
		// new Thread() -> 익명 Thread
		new Thread(() ->{
			for(int i = 1; i<=1000; i++) {
				text1.setText(i+" ");
				try {
					Thread.sleep(10);	// 0.01초					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		// 버튼 클릭 시 A ~ Z까지 text2에 출력
		btn.addActionListener((e)->{
			
			new Thread(()->{
				for (char ch='A'; ch<='Z'; ch++) {
					text2.setText(ch+"");
					try {
						Thread.sleep(200);	// 0.01초					
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}).start();
		});
		
		
	}// 생성자 끝
	
	
	public static void main(String[] args) {
		new GUIThreadExam();
	}
	/**
	 * JFrame title에 시계움직이기
	 */
	class ClockThread extends Thread {
		@Override
		public void run() {
			while(true) {
				Calendar now = Calendar.getInstance();
				int y = now.get(Calendar.YEAR);
				int m = now.get(Calendar.MONTH);
				int d = now.get(Calendar.DATE);
				
				int h = now.get(Calendar.HOUR);
				int min = now.get(Calendar.MINUTE);
				int s = now.get(Calendar.SECOND);
				
				String time = y+"년 "+m+"월 "+d+"일 "+h+" : "+min+" : "+s;
				
				// JFrame title에 time 추가
//				setTitle(time);
				
				GUIThreadExam.this.setTitle(time);
				try {
					Thread.sleep(1000);					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	// while문 끝
			
		}	// run 끝
	}	// inner 클래스 끝
}

