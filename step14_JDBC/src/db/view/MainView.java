package db.view;

import db.dao.EmpDAO;
import db.dto.Emp;

public class MainView {

	public static void main(String[] args) {
		
		System.out.println("----JDBC 시작 ----");
		
		EmpDAO dao = new EmpDAO();
		
		dao.getEmpInfo();
				
		System.out.println("\n----2.삭제----");
		dao.deleteByEmpno(8000);
		dao.deleteByEmpno(7521);
		dao.deleteByEmpno(7369);
		
		System.out.println("\n----3. 등록하기----");
//		dao.insert(new Emp(9000, "흰둥이", "집주인", 500, null));
		
		System.out.println("\n----4.수정하기----");
		int res = dao.update(new Emp(9000, "짱구", "유치원생", 100, null));
		if (res == 0) System.out.println(res+" = 수정되지 않았습니다.");
		else System.out.println(res + " = 수정되었습니다.");
	}
}
