package com.board.control;

import java.util.Scanner;

import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardService;

public class BoardProc {
	
	//필드선언
	Scanner sc = new Scanner(System.in);
	//배열 선언 공통으로 쓰기위해 필드로 선언
	Board[] boardAry = new Board[10];
	BoardService service = new BoardServiceImpl();

	public void execute() {
		while(true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.변경 5.글삭제 6.종료");
			int menu = 0;
			try {
				menu = sc.nextInt(); //error 발생가능한 곳.
			}catch(Exception e) {			
				System.out.println("정상적인 메뉴선택해주세요.");
//				e.printStackTrace();
				sc.nextLine();
			}
			
			if(menu==1) {
				writeBoard();
			}else if(menu==2) {
				getBoard();
			}else if(menu==3) {
				getBoardList();
			}else if(menu==4) {
				updateBoard();
			}else if(menu==5) {
				getBoardDelete();
			}else if(menu==6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}
	public void writeBoard() {
		System.out.println("글작성.");
		System.out.println("게시글 번호 입력: ");
		int boardNo = 0;
		boolean run = true;
		while(run) {
			try {
				boardNo = sc.nextInt(); //error 발생가능한 곳.
				sc.nextLine();
				run = false;
			}catch(Exception e) {
				System.out.println("게시글 번호는 숫자로 입력하세요.");
				System.out.println("게시글 번호 입력: ");
				sc.nextLine();
			}	
			
		}
		System.out.println("제목을 입력: ");
		String title = sc.next();
		System.out.println("내용을 입력: ");
		String contents = sc.next();
		System.out.println("작성자 입력: ");
		String writer = sc.next();
		
		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);

	}
	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력: ");
		int boardNo = sc.nextInt();
		Board board =  service.getBoard(boardNo, boardAry);
		System.out.println(board);

	}
	public void getBoardList() {
		System.out.println("전체글조회.");
		Board[] resultAry = service.getBoardList(boardAry);
		for(Board brd : resultAry) {
			if(brd!=null)
			System.out.println(brd);
		}

	}
	public void updateBoard() {
		System.out.println("수정할 글 번호: ");
		int boardNo = 0;
		boolean run = true;
		while(run) {
			try {
				boardNo = sc.nextInt(); //error 발생가능한 곳.
				sc.nextLine();
				run = false;
			}catch(Exception e) {
				System.out.println("수정할 번호는 숫자로 입력하세요.");
				System.out.println("수정할 번호 입력: ");
				sc.nextLine();
			}	
			
		}
//		boardNo = sc.nextInt();
		System.out.println("변경할 제목: ");
		String title = sc.next();
		System.out.println("변경할 내용: ");
		String content = sc.next();
		System.out.println("변경할 이름: ");
		String writer = sc.next();
		
		
		Board board1 = new Board(boardNo, title, content, writer);
		service.updateBoard(board1, boardAry);
	}
	
	public void getBoardDelete() {
		System.out.println("몇번 글을 삭제 합니까?");
		int boardNo =0;
		boolean run = true;
		while(run) {
			try {
				boardNo = sc.nextInt();
				sc.hasNextLine();
				run = false;
			}catch(Exception e) {
				System.out.println("삭제할 번호를 숫자로 입력하세요.");
				System.out.println("삭제할 번호 입력: ");
				sc.nextLine();
			}
		service.getBoardDelete(boardNo, boardAry);
		}
		
		
		
	}
}
