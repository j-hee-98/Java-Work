package ex0307.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
//"192.168.0.35"
public class ClientChat {
	Socket sk;
	public ClientChat() {
		// Socket 생성
		try {
			sk = new Socket("127.0.0.1", 8888);
			BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));					
			
			new Thread(()->{
				try {
					while(true) {						
						String data = br.readLine();
						if (data.equals("exit")) break;
						System.out.println(data);

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 읽기 스레드- 익명(람다로 만들기)
		// 키보드 입력 받아서 보내는 스레드 - SendThread
		SendThread st = new SendThread(sk, "Client");
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.print("클라이언트 입력> ");
				String inData = sc.nextLine();
				
				PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
				pw.println(inData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		st.start();
	}
	
	public static void main(String[] args) {
		new ClientChat();
		
	}
}
