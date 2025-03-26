package db.utill;

/*
 * DB 설정 정보에 해당하는 상수필드를 관리하는 부분
 */

public interface DbProperites {

	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	
	String URL = "jdbc:mysql://localhost:3306/mytest";
	String USER_ID = "root";
	String USER_PASS = "admin";
}
