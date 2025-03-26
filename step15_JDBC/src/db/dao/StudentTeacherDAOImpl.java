package db.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.dto.Room;
import db.dto.Student;
import db.dto.Subject;
import db.dto.Teacher;
import db.utill.DbManager;
public class StudentTeacherDAOImpl implements StudentTeacherDAO{
	// select * from student where  수_주민등록번호 like '%-2%'
	@Override
	public List<Student> getGenderByWomen() {
		Connection cos = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from student where ssn like '%-2%'";
		List<Student> list = new ArrayList<Student>();
		
		try {
			cos = DbManager.getConnection();
			ps = cos.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String ssn = rs.getString(3);
				String contact = rs.getString(4);
				String addr = rs.getString(5);
				String email = rs.getString(6);
				
				Student st = new Student(id, name, ssn, contact, addr, email);
				list.add(st);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(cos, ps, rs);
		}
		
		return list;
	}
	
	//select * from teacher  where 주소 like ?
	@Override
	public List<Teacher> getTeacherInfoByAddr(String gu) {
		Connection cos = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from teacher  where address like ?";
		List<Teacher> list = new ArrayList<Teacher>();
		
		try {
			cos = DbManager.getConnection();
			ps = cos.prepareStatement(sql);
			ps.setString(1, "%"+gu+"%");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				Teacher tc = new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				list.add(tc);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(cos, ps, rs);
		}
		
		return list;
	}
	
	/**
	 * 5. 과목을 인수로 전달받아 그 과목을 강의하는 강사의 정보 (서브쿼리)
         select * from teacher where 수강코드 =
          (select 수강코드 from subject where upper(과목)=upper( ? ))
	 */
	@Override
	public Teacher getTeacherInfoBySubject(String subject) {
		Connection cos = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Teacher tc = null;
		String sql = "select * from teacher where subject_code = \r\n"
				+ "          (select subject_code from subject where upper(subject_name)=upper( ? ))";
		
		try {
			cos = DbManager.getConnection();
			ps = cos.prepareStatement(sql);
			ps.setString(1, subject);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String jumin = rs.getString(3);
				String phone = rs.getString(4);
				String addr = rs.getString(5);
				String email = rs.getString(6);
				String code = rs.getString(7);
				
				tc = new Teacher(id, name, jumin, phone, addr, email, code);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(cos, ps, rs);
		}
		
		
		return tc;
	}
	
	/**
	 * 8강사의 번호를 인수로 전달받아 뷰에서 그 강사번호에 해당하는 정보를 출력한다
	 *   select * from v_teacherInfo  where 강사번호=?
	 *
	 * */
	@Override
	public Teacher getTeacherInfoByNo(int teacherNo) {
		Connection cos = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Teacher tc = null;
		String sql = "select * from v_tear  where teacher_id=?";
		
		try {
			cos = DbManager.getConnection();
			ps = cos.prepareStatement(sql);
			ps.setInt(1, teacherNo);
			
			rs = ps.executeQuery();
			if (rs.next()) {
				tc = new Teacher();
				
				tc.setTeacherNo(rs.getInt(1));
				tc.setTeacherName(rs.getString(2));
				
				Subject subject = new Subject(rs.getString(3), rs.getString(4));
				tc.setSubject(subject);
				
				tc.setRoom( new Room(rs.getInt(5),rs.getInt(6)) );
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(cos, ps, rs);
		}
		return tc;
	}
}