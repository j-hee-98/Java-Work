package ex0307.chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 키보드 입력을 받아서 상대측에게 데이터 전송
 */

public class SendThread extends Thread {

	Socket sk;
	String name;
	public SendThread(Socket sk, String name) {
		this.sk = sk;
		this.name = name;
	}
	
	@Override
	public void run() {
			
		try {		
			Scanner sc = new Scanner(System.in);
			System.out.print("입력> ");
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			
			while(true) {
				String inputData = sc.nextLine();
				if (inputData.equals("exit")) {
					pw.println(inputData); // exit 단어를 전송
					break;
				} else {
					pw.println(name+" 보낸 내용 : "+inputData);
				}
			}
			System.out.println(name+"의 보내는 스레드가 종료됩니다...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("모든 프로그램 종료...");
			System.exit(0);
		}
		
	}
	
}
