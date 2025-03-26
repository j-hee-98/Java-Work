package ex0307.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
//"192.168.0.35"
public class ClientChatExam {
	public ClientChatExam() {
		// Socket 생성
		try {
			Socket sk = new Socket("127.0.0.1", 8888);
			
			System.out.println("서버와 대화 시작..");
			
			new SendThread(sk, "CLIENT").start();
			
			new Thread(() -> {
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
					
					while(true) {
						String data = br.readLine();
						if(data.equals("exit")) break;
						
						System.out.println(data);
					}
					System.out.println("Client의 받는 스레드 종료...");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 읽기 스레드- 익명(람다로 만들기)
		// 키보드 입력 받아서 보내는 스레드 - SendThread
	}
	
	public static void main(String[] args) {
		new ClientChatExam();
		
	}
}
