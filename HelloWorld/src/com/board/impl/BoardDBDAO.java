package com.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class BoardDBDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	String name = null;
	
	//업데이트 보드 권한 확인부분 = 샘꺼
	   public boolean checkResponsibility(BoardDB board) {
		      // 해당글과 작성자의 일치여부 확인
		      conn = DAO.getConnect();
		      String sql = "select count(*) as cnt from boards" + " where orig_no is null" + " and board_no = ?"
		            + " and writer = ? ";
		      int result = 0;
		      try {
		         pstmt = conn.prepareStatement(sql);
		         pstmt.setInt(1, board.getBoardNo());
		         pstmt.setString(2, board.getWriter());
		         rs = pstmt.executeQuery();
		         if (rs.next()) {
		            result = rs.getInt("cnt");
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            conn.close();
		         } catch (SQLException e) {
		            e.printStackTrace();
		         }
		      }
		      if (result > 0)//권한자
		         return true;
		      else
		         return false;
		   }
	
	public void updateBoard(BoardDB board) {
		
		conn = DAO.getConnect();
		System.out.println("content : "+ board.getContent());
		String sql = "update boards set orig_no = orig_no";  
		if(board.getTitle() != null && !board.getTitle().equals("")) {
			sql +=", title= ?";
		}
		if(board.getContent() != null && !board.getContent().equals("")) {
			sql += ", content= ?";
		}
			sql += " where board_no = ? and orig_no is null";
		int n = 0;	
		try {
			pstmt = conn.prepareStatement(sql);
			if(board.getTitle() != null && !board.getTitle().equals("")) {
			pstmt.setString(++n, board.getTitle());
			}
			if(board.getContent() != null && !board.getContent().equals("")) {
			pstmt.setString(++n, board.getContent());
			}
			pstmt.setInt(++n, board.getBoardNo());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.prepareStatement(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void replyBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values((select max(board_no)+1 from boards) ,?,?,?,sysdate,?)";  
		//board_seq.nextval
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			pstmt.setInt(4, board.getOrigNo());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void insertBoard(BoardDB board) {//게시글 등록
		conn = DAO.getConnect();
		String sql = "insert into boards values((select max(board_no)+1 from boards) ,?,?,?,sysdate,null)";  //board_seq.nextval
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public String getUserName(String id, String passwd) { //로그인
		conn = DAO.getConnect();
		String sql = "select * from user_login where id=? and passwd=?";
		String name = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);

			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return name;
	}
	
	public List<BoardDB> getBoardList(){ //전체 조회
		List<BoardDB> list = new ArrayList<>();
		conn = DAO.getConnect();
		String sql="select * from boards order by 1 desc";
		BoardDB bd = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bd = new BoardDB();
				bd.setBoardNo(rs.getInt("board_no"));
				bd.setTitle(rs.getString("title"));
				bd.setContent(rs.getString("content"));
				bd.setWriter(rs.getString("writer"));
				bd.setCreationDate(rs.getString("creation_date"));
				bd.setOrigNo(rs.getInt("orig_no"));
				list.add(bd);
								
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		return list;
		
	}
	public BoardDB getBoard(int boardNo) { //원본 글 조회
		BoardDB board = null;
		conn = DAO.getConnect();
		String sql = "select * from boards where board_no = ? and orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				                          
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return board;
		
	}
	
	public List<BoardDB> getReplyList(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no ="+boardNo;
		List<BoardDB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;		
	}
	
	public boolean checkForReply(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select count(*) as cnt from boards where orig_no = ?";
		int cnt = 0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public void deleteBoard2(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "delete from boards where board_no=? ";
		int rCnt = 0; // 타이틀 코텐츠 작성자(id)
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(++rCnt, board.getBoardNo());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	public void deleteBoard1(BoardDB board) {
		conn = DAO.getConnect();
		List<BoardDB> list = getReplyList(board.getBoardNo());
		if(list.size() > 0) {
			System.out.println("권한없음");
		}else {
			String sql = "delete from boards where board_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoardNo());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}}
	}
	
	public void deleteBoard(BoardDB board) {//글 삭제
	    conn = DAO.getConnect();
	    String sql = "delete from boards where board_no = ?";
	    try {
	       pstmt = conn.prepareStatement(sql);
	       pstmt.setInt(1, board.getBoardNo());
	       pstmt.executeUpdate();
	    } catch (SQLException e) {
	       e.printStackTrace();
	    } finally {
	       try {
	          conn.close();
	       } catch (SQLException e) {
	          e.printStackTrace();
	       }
	    }
	}
	
	public void delBoard(BoardDB board) {//게시글 원본이랑 댓글이 있을 경우 댓글까지 삭제
		conn = DAO.getConnect();
		String sql = "delete from boards where board_no = ? or orig_no = ?";
		try {
			conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoardNo());
			pstmt.setInt(2, board.getBoardNo());
			pstmt.executeUpdate();
			System.out.println("삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();		
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
