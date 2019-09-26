package com.board.model;

public interface BoardService {
	//인터페이스는 메소드만 정의해 주면 된다.
	public void writeBoard(Board board);
	public Board getBoard(int boardNo);
	public Board[] getBoardList();
}
