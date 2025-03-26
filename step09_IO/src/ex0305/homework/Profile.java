package ex0305.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Profile {

	public Profile() {
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.프로필 저장\t 2.프로필 불러오기\t 3.종료");
			
			String choice = sc.nextLine();
			
			switch(choice) {
			
			case "1":
				System.out.print("이름> ");
				String name = sc.nextLine();
				System.out.print("몸무게> ");
				String weight = sc.nextLine();
				System.out.print("비밀번호> ");
				String password = sc.nextLine();
				
				saveProfile(name, weight, password);
				break;
			
			case "2":
				System.out.print("이름> ");
				String loadName = sc.nextLine();
				loadProfile(loadName);
				break;
			
			case "3":
				System.exit(0);
				
			default:
				System.out.println("다시 메뉴를 입력해주세요.");
			}
		}
	}
	
	// 프로필 저장
	public static void saveProfile(String name, String weight, String password) {
		File file = new File(name+".txt");
		
		if (file.exists()) {
			System.out.println("이미 존재하므로 다시 입력해주세요.");
			return;
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))
		) {
			bw.write(weight+":"+password);
			System.out.println("프로필 저장완료");
			
		}catch (IOException e) {
			System.out.println("파일을 저장하는 중 오류 발생");
			e.printStackTrace();
		}
	}
	
	//	프로필 불러오기
	public static void loadProfile(String name) {
	    File file = new File(name + ".txt");
	    
	    if (!file.exists()) {
	    	System.out.println(name+"님의 프로필 파일이 존재하지 않습니다.");
	    	return;
	    }
	    
	    try (BufferedReader br = new BufferedReader(new FileReader(file))){
	    	String line = br.readLine();
	    	if (line != null) {
	    		String [] profileData = line.split(":");
	    		if (profileData.length == 2) {
	    			System.out.println(name+"님 몸무게는 "+profileData[0]+"kg이고, 비밀번호는 "+profileData[1]+"입니다.");
	    		} else {
	    			System.out.println("파일 형식 잘못됨.");
	    		}
	    	}
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
}
