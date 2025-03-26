package ex0305.map;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class PropertiesExam {

	Properties pro = new Properties();
	
	public PropertiesExam() {
		// 저장 = 추가
		pro.setProperty("name", "둘리");
		pro.setProperty("age", "20");
		pro.setProperty("addr", "서울시 강남구");
		
		// 조회
		// 모든 key의 정보 가져오기
		Set<String> keys = pro.stringPropertyNames();
		for (String key : keys) {
			String value = pro.getProperty(key);
			System.out.println(key+" = "+value);
		}
	}
	/**
	 * 외부의 ~.properties 파일로딩하는 방법
	 * 	1) IO를 이용하는 방법
	 * 	2) ResourceBundle 이용방법
	 */
	
	// IO를 이용하는 방법
	public void test01() {
		pro.clear();	// 모두 제거하기, 비운다
		
		try {
			//1. 파일의 위치의 기준 프로젝트가 기준!-경로설정할때 src기준...
//		 	InputStream inputStream = 
//		 			new FileInputStream("src/ex0305/map/a.properties");
//		    pro.load(inputStream);
		    
		 
		    //2. 클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
//		    InputStream inputStream =
//		     PropertiesExam.class.getResourceAsStream("a.properties");
//		     pro.load(inputStream);
		
			 //3.클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
//			 InputStream inpupStream = 
//			this.getClass().getResourceAsStream("a.properties"); 
//			 pro.load(inpupStream);
			  
		
			 //4.ClassLoader의 모든 경로에서 파일 읽음. 보통 resources 폴더의 파일 읽을때 사용.
//			 InputStream inpupStream = 
//			//this.getClass().getClassLoader().getResourceAsStream("a.properties"); 
//			this.getClass().getClassLoader().getResourceAsStream("b.properties"); 
//			 pro.load(inpupStream);
			 
			 //5. ClassLoader의 Class내에 파일존재하는 경우
//			InputStream inpupStream =
//			this.getClass().getClassLoader().getResourceAsStream("ex0305/map/a.properties"); // 경로에 '/' 붙지않음. ClassLoader의 모든 경로에서 파일 읽음.
//				 pro.load(inpupStream);			
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("---출력---");
			Set<String> keys = pro.stringPropertyNames();
			for (String key : keys) {
				String value = pro.getProperty(key);
				System.out.println(key+" = "+value);
			}
			// 외부의 a.properties 로딩
	}
	
	// ResourceBundle 이용방법
	public void test02() {
		/**
		 * ResourceBundle은 ~.properties 파일을 로딩하는 전용 클래스로
		 * 파일의 확장자를 생략한다
		 * 기준 경로는 classes 폴더가 기준이 된다.
		 */
//		ResourceBundle rd = ResourceBundle.getBundle("b");	// b.properties
		ResourceBundle rd = ResourceBundle.getBundle("ex0305/map/a");	// b.properties
		for (String key : rd.keySet()) {
			String value = rd.getString(key);
			System.out.println(key+" = "+value);
		}
	}
	
	public static void main(String[] args) {
//		new PropertiesExam().test01();
		new PropertiesExam().test02();
	}
}
