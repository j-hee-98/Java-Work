package app.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.mvc.common.DBManager;
import app.mvc.dto.BoardDTO;
import app.mvc.dto.ReplyDTO;
import app.mvc.exception.DMLException;
import app.mvc.exception.SearchWrongException;

public class BoardDAOImpl implements BoardDAO {
	
	private static BoardDAO instance = new BoardDAOImpl();
	
	private BoardDAOImpl() {}
	
	public static BoardDAO getInstance() {
		return instance;
	}
	

	@Override
	public List<BoardDTO> boardSelectAll() throws SearchWrongException {
		Connection con=null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		BoardDTO boardDTO = null;
		List<BoardDTO> list = new ArrayList<>();
		String sql="select * from board order by board_no desc";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			
			//여기부터 작성하세요.
			rs = ps.executeQuery();
			while(rs.next()) {
				boardDTO = new BoardDTO(rs.getInt(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), rs.getString(5));
				list.add(boardDTO);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw new SearchWrongException("DB에 문제가 있어 다시 진행해주요^^");
			
		}finally {
			DBManager.releaseConnection(con, ps, rs);
		}			
		
		return list;
	}
	
	/**
	 * 제목에 특정 문자열이 포함된 레코드 검색 - 0개이상의 레코드 리턴!!!
	 * select * from board where subject like ?
	 */
	@Override
	public List<BoardDTO> boardSelectBySubject(String keyWord) throws SearchWrongException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardDTO boardDTO = null;
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		String sql = "select * from board where subject like ?";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "%"+keyWord+"%");
			
			rs = ps.executeQuery();
			while (rs.next()) {
				boardDTO = new BoardDTO(rs.getInt(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), rs.getString(5));
				list.add(boardDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SearchWrongException("검색 결과가 없습니다.");
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return list;
	}

	/**
	 * 글번호에 해당하는 레코드 검색 - pk를 대상으로 조건 ( 레코드수가 0 아니면 1)
	 * select * from board where board_no = ? 
	 */
	@Override
	public BoardDTO boardSelectByNo(int boardNo) throws SearchWrongException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardDTO boardDTO = null;
		String sql = "select * from board where board_no = ?";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			
			rs = ps.executeQuery();
			if (rs.next()) {
				boardDTO = new BoardDTO(
						rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SearchWrongException("검색 결과가 없습니다.");
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return boardDTO;
	}

	/**
	 * 게시물 등록하기
	 * insert into board (subject, writer, content, board_date) 
	 * values (?, ?, ?, now())
	 */
	@Override
	public int boardInsert(BoardDTO boardDTO) throws DMLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into board (subject, writer, content, board_date) \r\n"
				+ "values (?, ?, ?, now())";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, boardDTO.getSubject());
			ps.setString(2, boardDTO.getWriter());
			ps.setString(3, boardDTO.getContent());
			
			result = ps.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DMLException("");
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		
		return result;
	}

	/**
	 * 글번호에 해당하는 게시물 내용 수정하기
	 * update board set content = ? where board_no = ?
	 */
	@Override
	public int boardUpdate(BoardDTO boardDTO) throws DMLException {
		Connection con = null;
		PreparedStatement ps = null;
		int res = 0;
		String sql = "update board set content = ? where board_no = ?";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, boardDTO.getContent());
			ps.setInt(2, boardDTO.getBoardNo());
			
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DMLException("");
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		return res;
	}

	/**
	 * 글번호에 해당하는 레코드 삭제
	 * delete from board where board_no = ?
	 */
	@Override
	public int boardDelete(int boardNo) throws DMLException {
		Connection con = null;
		PreparedStatement ps = null;
		int res = 0;
		String sql = "delete from board where board_no = ?";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, boardNo);
			
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DMLException("");
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		return res;
	}

	/**
	 * 댓글 등록하기
	 *  insert into reply values(?, ? , now())
	 * */
	@Override
	public int replyInsert(ReplyDTO replyDTO) throws DMLException {
		Connection con = null;
		PreparedStatement ps = null;
		int res = 0;
		String sql = "insert into reply (reply_content, board_no, reply_regdate) values(?, ?, now())";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, replyDTO.getReplyContent());
			ps.setInt(2, replyDTO.getBoardNo());
			
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DMLException("");
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		
		return res;
	}

	/**
	 * 부모글에 해당하는 댓글정보 검색하기
	 *   select * from board where board_no=?  -> 1
	 *   select * from reply where board_no=? -> n
	 *   
	 *   
	 *   조인경우 : select * from board join reply using(board_no)  where board_no=?
	 * */
	@Override
	public BoardDTO replySelectByParentNo(int boardNo) throws SearchWrongException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardDTO boardDTO = null;
		String sql = "select * from board where board_no = ?";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			
			rs = ps.executeQuery();
			if (rs.next()) {
				boardDTO = new BoardDTO(rs.getInt(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), rs.getString(5));
				boardDTO.setRepliesList(this.replySelect(con, boardNo));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SearchWrongException("");
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return boardDTO;
	}
	
	/***
	 * 부모글에 해당하는 댓글정보 가져오기
	 * */
	private List<ReplyDTO> replySelect(Connection con ,int boardNo) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ReplyDTO> list = new ArrayList<ReplyDTO>();
		String sql = "Select * from reply where board_no = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				ReplyDTO reply = 
						new ReplyDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				list.add(reply);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return list;
	}

}













