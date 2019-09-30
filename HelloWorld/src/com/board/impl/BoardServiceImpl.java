package com.board.impl;
import com.board.model.Board;
import com.board.model.BoardService;

public class BoardServiceImpl implements BoardService {

	@Override
	public void writeBoard(Board board, Board[] boards) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i]==null) {
				boards[i]=board; //배열에 값이 없을 경우 입력받은 값을 배열에 넣겠다.
				break;			//한건 작성하고 정지해야 됨 무한반복 주의
			}
		}
	}

	@Override
	public Board getBoard(int boardNo, Board[] boards) {
		Board board = null;
		for(int i=0;i<boards.length;i++) {
			if(boards[i]!=null&&boards[i].getBoardNo()==boardNo) {//int 타입 boardNo라서 이퀄 안써도 된다.
				board = boards[i];
			}
		}
		return board;
	}

	@Override
	public Board[] getBoardList(Board[] boards) {
		Board[] boardAry = new Board[boards.length];
		for(int i=0;i<boards.length;i++) {
			boardAry[i] = boards[i];
		}
		return boardAry; //입력 받은 배열을 그대로 리턴하겠다.
	}
	@Override
	public void getBoardDelete(int boardNo, Board[] boards) {

		for(int i=0;i<boards.length;i++) {
			if(boards[i]!=null&&boards[i].getBoardNo()==boardNo) {//int 타입 boardNo라서 이퀄 안써도 된다.
				boards[i] = null;
			}
		}		
	}
	@Override
	public void updateBoard(Board board, Board[] boards) {
		for(int i=0;i<boards.length;i++) {
			if(boards[i]!=null&&boards[i].getBoardNo()==board.getBoardNo()) {
				boards[i].setContents(board.getContents());
				boards[i].setTitle(board.getTitle());
				boards[i].setWriter(board.getWriter());
				
			}
	}
	}	
}
