package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();
	
	@Override
	public String loginCheck(String id, String passwd) {
		String name = dao.getUserName(id, passwd);
		
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);
	}

	@Override
	public List<BoardDB> getBoardList() {
		List<BoardDB> list = dao.getBoardList();
		return list;
	}

	@Override
	public BoardDB getBoard(int boardNo) {
		return null;
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		return null;
	}

	@Override
	public void insertReply(BoardDB board) {
		
	}

	@Override
	public void updateBoard(BoardDB board) {
		
	}

	@Override
	public void deleteBoard(int boardNo) {
		
	}


}
