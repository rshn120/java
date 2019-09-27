package com.board.model;

public class Board {
	int boardNo;
	String contents;
	String title;
	String writer;
	public Board(int boardNo, String contents, String title, String writer) {
		super();
		this.boardNo = boardNo;
		this.contents = contents;
		this.title = title;
		this.writer = writer;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() { //마우스 오른쪽 소스에서 제네릭 투 스트링 클릭!
		return "[게시번호=" + boardNo + ", 컨텐츠=" + contents + ", 제목=" + title + ", 글쓴이=" + writer + "]";
	}
	
}
