package com.board.model;

import java.util.List;

public interface BoardCollection {
	//인터페이스는 메소드만 정의해 주면 된다.
	public void writeBoard(Board board,  List<Board>  boards); //글작성
	public Board getBoard(int boardNo,  List<Board>  boards); //한건조회
	public List<Board> getBoardList( List<Board>  boards);//전체리스트
	public void updateBoard(Board board,  List<Board> boards);//내용변경
	public void getBoardDelete(int boardNo,  List<Board>  boards);//글삭제	
	void deleteBoard(int boardNo, List<Board> boards);
	void writerBoard(Board board, List<Board> boards);
	
	
}
