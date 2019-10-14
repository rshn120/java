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
		return dao.getBoard(boardNo);
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		return dao.getReplyList(boardNo);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.replyBoard(board);
	}

	@Override
	public void updateBoard(BoardDB board) {
		//해당글에 대한 권한 확인.
		if(dao.checkResponsibility(board)) {
		dao.updateBoard(board);
		System.out.println("변경됨");
		}else {
			System.out.println("권한없음");
		}
		
	}
	@Override
	public void deleteBoard2(BoardDB board) {
		
		if (dao.checkResponsibility(board)) { //권한체크
			if(dao.checkForReply(board.getBoardNo())){//댓글 유무 체크
				dao.deleteBoard2(board);
			}else {
				System.out.println("댓글이 존재합니다.");
			}
			
		} else
			System.out.println("해당글에 대한 삭제 권한이 없습니다.");

		
		
}

	@Override
	public void deleteBoard(BoardDB board) {
		if(dao.checkResponsibility(board)) {
		dao.deleteBoard(board);}
		else {
			System.out.println("권한없음");
		}
	}

	@Override
	public void delBoard(BoardDB board) {
		if(dao.checkResponsibility(board)){
				dao.delBoard(board);
		}
	}

	@Override
	public void delBoard1(BoardDB board) {
		// TODO Auto-generated method stub
		
	}

}
