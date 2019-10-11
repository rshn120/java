package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;



public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId=null;
	
	public void execute() {
		loginCheck();
		
		while(true) {
			int menu=0;
			System.out.println("1.게시글 작성 2.리스트 3.글조회 4.글 내용수정  5.글 삭제9.종료");
			menu = sc.nextInt(); 
			if(menu==1) {
				System.out.println("게시글 작성");//등록
				writeBoard();
			}else if(menu==2) {
				System.out.println("전체조회");//조회
				getBoardList();
			}else if(menu==3) {
				System.out.println("원본글 조회");//원본글 조회
				getBoard();
			}else if(menu==4) {
				System.out.println("글내용 수정.");//수정
				updateBoard();
			}else if(menu==5) {
				System.out.println("5번을 선택했습니다.");//삭제
				deleteBoard();
			}else if(menu==9) {
				System.out.println("프로그램을 종료합니다.");
			break;	
			}
			
		}
	}
	public void updateBoard() {
		System.out.println("변경할 글 번호 : ");
		int boardNo = sc.nextInt();sc.nextLine();
		System.out.println("제목변경");
		String title = sc.nextLine();
		System.out.println("내용변경");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);

		service.updateBoard(board);
	}
	//로그인 체크
	public void loginCheck() {
		while(true) {
			System.out.println("id를 입력");
			String id = sc.nextLine();
			System.out.println("pass를 입력");
			String passwd = sc.nextLine();
			String name = service.loginCheck(id, passwd);
			
			if(name!=null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;
				break;
			}else {
				System.out.println("아이디와 비밀번호를 다시 입력: ");
			}
		}
	}
	public void  getBoard()	{
		System.out.println("조회할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		//원본글
		BoardDB board = service.getBoard(boardNo);
		if(board != null) {
		System.out.println("---------[원본글]------------");
		System.out.println("제목 : "+board.getTitle());
		System.out.println("내용 : "+board.getContent());
		System.out.println("작성자: "+board.getWriter());
		System.out.println("작성일자: "+board.getCreationDate());
		//댓글
		List<BoardDB> list = service.getReply(boardNo);
		System.out.println("---------[댓글]--------------");
		
		for(BoardDB brd : list) {
			System.out.println("-> "+brd.getBoardNo()+" | "+brd.getContent()+" | "+brd.getCreationDate());
		}System.out.println("-----------------------------------");
		System.out.println("1.댓글작성 2.이전메뉴");
		
		int subMenu = 0;
		if(subMenu==1) {
			System.out.println("댓글 입력: ");
			String reply = sc.nextLine();
			BoardDB board1 = new BoardDB();
			board1.setContent(reply);
			board1.setOrigNo(board.getBoardNo());
			board1.setWriter(loginId);
			service.insertReply(board1);
		}else {
	
			return;
		} 
	}else {
		System.out.println("없는 글 번호입니다.");
		return;
		}
	}
	public void replyBoard() {//댓글
		
	}
	public void writeBoard() {//글 작성
		
		System.out.println("재목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String content = sc.nextLine();
	
		// 입력받은 값을 board 인스턴스에 담는다.
		BoardDB board = new BoardDB();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);
		service.insertBoard(board);
	}
	
	public void getBoardList() {//전체 조회
		System.out.println("전체글 조회");
		List<BoardDB> boards = service.getBoardList();
		for(BoardDB board : boards) {
			System.out.println(board);
		}
	}
	public void deleteBoard() {//삭제
		System.out.println("삭제할 글번호: ");
		int dbNo = sc.nextInt();
		sc.nextLine();
		
		BoardDB board = service.getBoard(dbNo);		
	
		//System.out.println(board.getWriter());
		if(board == null) {
			System.out.println("없는 게시판");
		}else if(loginId.equals(board.getWriter()))
			{service.deleteBoard(dbNo);
			System.out.println(dbNo+"삭제되었습니다.");}
		else {
			System.out.println("권한이 없습니다.");
		}
		
	}
}
