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
			System.out.println("1.게시글 작성 2.게시글리스트 9.종료");
			menu = sc.nextInt(); 
//			sc.nextLine();
			if(menu==1) {
				System.out.println("1번을 선택했습니다.");
				writeBoard();
			}else if(menu==2) {
				System.out.println("2번을 선택했습니다.");
				getBoardList();
			}else if(menu==3) {
				System.out.println("3번을 선택했습니다.");
			}else if(menu==4) {
				System.out.println("4번을 선택했습니다.");
			}else if(menu==5) {
				System.out.println("5번을 선택했습니다.");
			}else if(menu==9) {
				System.out.println("프로그램을 종료합니다.");
			break;	
			}
			
		}
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
	public void writeBoard() {
		
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
	
	public void getBoardList() {
		System.out.println("전체글 조회");
		List<BoardDB> boards = service.getBoardList();
		for(BoardDB board : boards) {
			System.out.println(board);
		}
	}
}
