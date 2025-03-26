package db.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC를 위한
 * 로드, 연결, 닫기 구현
 */

public class DbManager {

	/*
	 * 로드
	 */
	static {
		try {
			Class.forName(DbProperites.DRIVER_NAME);			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 연결( 예외 던짐)
	 */
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection
				(DbProperites.URL, DbProperites.USER_ID, DbProperites.USER_PASS);
	}
	
	/*
	 * 닫기 직접 예외 처리
	 *  1. (DDL or DML - create, insert, update, delete 인 경우)
	 */
	public static void dbClose(Connection con, Statement st) {
		try {
			if (st != null) st.close();
			if (con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 닫기 (select 인 경우)
	 */
	public static void dbClose(Connection con, Statement st, ResultSet rs) {
		try {
			if (rs != null) rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dbClose(con, st);
	}
}
