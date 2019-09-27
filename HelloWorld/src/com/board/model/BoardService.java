package com.board.model;

public interface BoardService {
	//인터페이스는 메소드만 정의해 주면 된다.
	public void writeBoard(Board board, Board[] boards); //글작성
	public Board getBoard(int boardNo, Board[] boards); //한건조회
	public Board[] getBoardList(Board[] boards);//전체리스트
	public void updateBoard(Board board, Board []boards);//내용변경
	public void getBoardDelete(int boardNo, Board[] boards);//글삭제	
	
	
}
