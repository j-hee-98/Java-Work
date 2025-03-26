package ex0310.multiChat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUIChatExam extends JFrame {

	JTextArea textArea = new JTextArea();
	JTextField textField = new JTextField();
	JScrollPane jsp = new JScrollPane(textArea);
	
	Socket sk;
	PrintWriter pw;
	BufferedReader br;
	
	public ClientGUIChatExam() {
		super("채팅하기");	// title 넣기
		
		// Container 위에 Component 추가
		Container con = super.getContentPane();
		con.add(jsp, BorderLayout.CENTER);	//정가운데 추가
		con.add(textField, BorderLayout.SOUTH);
		
		// textArea 비활성화
		textArea.setFocusable(false); // 커서놓기 안됨
		textArea.setBackground(Color.lightGray);
		
		//옵션 설정
		super.setSize(500, 400);
		super.setLocationRelativeTo(null); 	//정중앙놓기
		super.setVisible(true); // 창 보이기
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//x 클릭 했을 때 종료
		
		// 서버 접속
		connection();
		
		// textField에 값을 입력 후 enter를(event) 치면 서버에 데이터 전송하기(람다식으로 작성(인수 1개))
		textField.addActionListener(e -> {
			// textField에 있는 데이터를 읽는다
			String inputData = textField.getText();
			// 서버에 전송
			pw.println(inputData);
			// textField를 지운다
			textField.setText("");
		});
		
		// 서버가 보내오는 내용을 읽을 스레드 처리
		new Thread(()-> {
			try {
				String data = null;
				while((data = br.readLine()) != null) {
					// textArea에 추가
					textArea.append(data+"\n");	// 끝에 추가
					
					// 옵션 : 
					textArea.setCaretPosition(textArea.getText().length());
					
					
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}).start();
		
		
	}// 생성자 끝
	
	/**
	 * 서버에 접속 요청 메서드
	 * 192.168.0.40
	 */
	public void connection() {
		try {
			sk = new Socket("127.0.0.1", 8000);
			
			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			pw = new PrintWriter(sk.getOutputStream(), true);
			
			// 대화명 입력받는 창 띄운다.
			String name = JOptionPane.showInputDialog(this, "대화명을 입력해주세요.");
			// 서버에 전송
			pw.println(name);
			
			super.setTitle("["+name+"]");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new ClientGUIChatExam();
	}
}
