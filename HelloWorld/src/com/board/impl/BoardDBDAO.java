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

	public void insertBoard(BoardDB board) {
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

	public String getUserName(String id, String passwd) {
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
		}
		return name;
	}
	
	public List<BoardDB> getBoardList(){
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
				bd.setOrigNo(rs.getString("orig_no"));
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
}
