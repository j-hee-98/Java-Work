package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.utill.DbManager;

public class TransactionDAO {
  /**
   * 계좌이체 기능 구현
   * inputAccount : 입금 계좌, outputAccount : 출금 계좌, money : 금액
   * 
   * transaction 이란 여러개의 쿼리를 하나의 단위로 묶어서 한번에 commit, rollback
   * 	( ACID 개념 적용)
   * */
	
	// 하나의 connection을 transfer에서 만들어서 전달
	public void transfer(String inputAccount, String outputAccount, int money) {
		Connection con = null;
		try {
			con = DbManager.getConnection();
			con.setAutoCommit(false);
			// jdbc는 자동 autocommit이다
			
			// 출금 - update
			int res = this.withdraw(con, outputAccount, money);
			if (res == 0) throw new SQLException("출금계좌번호 오류로 이체 실패하셨습니다.");
			
			// 입금 - update
			res = this.deposit(con, inputAccount, money);
			if (res == 0) throw new SQLException("입금계좌번호 오류로 이체 할 수 없습니다.");
			
			// 잔액 확인 - select
			if ( this.balance(con, inputAccount) ) 
				throw new SQLException("입금계좌 잔액초과로 이체 할 수 없습니다.");
			
			// 성공
			con.commit(); // 모두 적용
			System.out.println("계좌이체 성공!!");
			
		} catch (Exception e) {
//			e.printStackTrace();
			try {
				con.rollback();				
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			System.out.println(e.getMessage()+"\n");
		} finally {
			DbManager.dbClose(con, null);
		}
	}
	
	/**
	 * 출금하기
	 */
	public int withdraw(Connection con, String outputAccount, int money) throws SQLException{
		
//		PreparedStatement ps = null;
		String sql = "update bank set balance = balance-? where account = ?";
		int result = 0;
		
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			
			ps.setInt(1, money);
			ps.setString(2, outputAccount);
			
			result = ps.executeUpdate();
		}
		
		return result;
	}
	
	/**
	 * 입금하기
	 */
	public int deposit(Connection con, String inputAccount, int money) throws SQLException{
		
		String sql = "update bank set balance = balance+? where account = ?";
		int result = 0;
		
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			
			ps.setInt(1, money);
			ps.setString(2, inputAccount);
			
			result = ps.executeUpdate();
		}
		
		return result;
	}
	
	/**
	 * 잔액확인
	 * 
	 * : 입금계좌의 총액이 1000을 초과 여부 판단
	 * @return : boolean - true이면 초과, false 초과아님
	 */
	public boolean balance(Connection con, String inputAccount) throws SQLException{
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select balance from bank where account = ?";
		boolean result = false;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, inputAccount);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				int balance = rs.getInt(1);
				if (balance >= 1000) result = true;
			}
				
		} finally {
			DbManager.dbClose(null, ps, rs);
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("--1. 출금계좌 오류----");
//		dao.transfer("A02", "A05",200);//입금, 출금, 금액
		
		System.out.println("--2. 입금계좌 오류----");
//		dao.transfer("A04", "A01",200);//입금, 출금, 금액
		
		
		System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
//		dao.transfer("A02", "A01",700);//입금, 출금, 금액
		
		System.out.println("--4. 성공----------");
		dao.transfer("A02", "A01",100);//입금, 출금, 금액
	}
}











