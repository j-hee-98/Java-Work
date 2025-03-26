package ex0306;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try (ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("src/mvc/view/save.txt", true))) {
			
			while(true) {
				System.out.println("입력> ");
				br.
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}				
	
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			
//			System.out.print("입력> ");
//			String data = sc.nextLine();
//			text(data);
//			
//			if ("exit".equals(data)) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//		}
