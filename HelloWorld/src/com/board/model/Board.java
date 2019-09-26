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
	
}
