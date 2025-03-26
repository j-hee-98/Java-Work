package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.dto.Emp;
import db.utill.DbManager;

public class EmpDAO {

	/*
	 * emp 테이블에서 사원정보 검색하기
	 */
	
	public void getEmpInfo() {
		// 로드 연결, 실행, 닫기
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String sql = "select empno, ename, hiredate from emp";
		
		try {
			
			con = DbManager.getConnection();
			
			// 실행
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {	// 커서가 앞으로(행) 이동 (더 이상 없으면 false)
				// 열을 조회
				// 컬럼의 해당하는 index의 값을 넣어줘도 되고, 컬럼명으로 해도 된다.
				int empno = rs.getInt("empno");
				String ename = rs.getString(2);
				String hiredate = rs.getString(3);
				
				System.out.println(empno + " | " + ename +" | "+ hiredate);
			}
			System.out.println("\n***정보검색 완료되었습니다***");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, st, rs);
		}
	}
	
	/**
	 * 사원번호에 해당하는 사원정보 삭제
	 */
	public void deleteByEmpno(int empno) {
		Connection con = null;
		Statement st = null;
		String sql = "delete from emp where empno = "+ empno;
		
		try {
			con = DbManager.getConnection();
			st = con.createStatement();
			
			int res = st.executeUpdate(sql);
			if (res == 0) System.out.println(res + " = 삭제되지 않았습니다.");
			else System.out.println(res + "개 삭제되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			DbManager.dbClose(con, st);
		}
	}
	
	/*
	 * 사원등록하기
	 * insert into emp(empno, ename, job, sal, hiredate) values(?,?,?,?,now())
	 */
	public void insert(Emp emp) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into emp(empno, ename, job, sal, hiredate) "
				+ "values(?,?,?,?,now())";
		
		try {
			
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			// sql에 ?가 있다면 ?의 개수만큼 순서대로 ~. setXxx(index, 값);
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getSal());
			
			int res = ps.executeUpdate();
			if (res == 0) System.out.println("등록되지 않았습니다.");
			else System.out.println("등록되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps);
		}
	}
	
	/*
	 * 사원번호에 해당하는 사원정보 수정하기 (ename, job, sal 수정)
	 */
	public int update(Emp emp) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "update emp set ename = ?, job = ?, sal = ? where empno = ?";
		int res = 0;
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getJob());
			ps.setInt(3, emp.getSal());
			ps.setInt(4, emp.getEmpno());
			
			res = ps.executeUpdate();
//			if (res == 0) System.out.println("수정되지 않았습니다.");
//			else System.out.println("수정되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps);
		}
		
		return res;
	}
	
}
