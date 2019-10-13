package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {
	private static final int boardNo = 0;
	private static final int orgNo = 0;
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {
		loginCheck();

		while (true) {
			int menu = 0;
			System.out.println("1.게시글 작성 | 2.리스트 | 3.글조회  | 4.글 내용수정 | 5.글 삭제 | 6.원본글 & 댓글 삭제| 9.종료");
			menu = sc.nextInt();
			if (menu == 1) {
				// 등록
				writeBoard();
			} else if (menu == 2) {
				// 전체 조회
				getBoardList();
			} else if (menu == 3) {
				// 원본글 조회
				getBoard();
			} else if (menu == 4) {
				// 수정 - 본인 글이 아니면 수정 못함
				updateBoard();
			} else if (menu == 5) {
				// 삭제 - 본인 글이 아니면 삭제 못함
				deleteBoard();
			} else if (menu == 6) {
				//삭제 - 원본글과 댓글까지 삭제
				delBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}

	public void updateBoard() {
		while (true) {
			BoardDB board = new BoardDB();
			System.out.println("변경할 글 번호 : ");
			int boardNo = sc.nextInt();
			sc.nextLine();
			BoardDB bd = service.getBoard(boardNo);

			if (bd == null) {
				System.out.println("없는 게시글입니다.");
				return;
			} else if (loginId.equals(bd.getWriter())) {
				service.updateBoard(board);
				System.out.println("수정되었습니다.");
			} else {
				System.out.println("게시글 주인이 아닙니다.");
				return;
			}

			System.out.println("제목변경");
			String title = sc.nextLine();
			System.out.println("내용변경");
			String content = sc.nextLine();

			board.setBoardNo(boardNo);
			board.setTitle(title);
			board.setContent(content);
			break;
		}
	}

	// 로그인 체크
	public void loginCheck() {
		while (true) {
			System.out.println("id를 입력");
			String id = sc.nextLine();
			System.out.println("pass를 입력");
			String passwd = sc.nextLine();
			String name = service.loginCheck(id, passwd);

			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;
				break;
			} else {
				System.out.println("아이디와 비밀번호를 다시 입력: ");
			}
		}
	}

	public void getBoard() {
		System.out.println("조회할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		// 원본글
		BoardDB board = service.getBoard(boardNo);
		if (board != null) {
			System.out.println("---------[원본글]------------");
			System.out.println("제목 : " + board.getTitle());
			System.out.println("내용 : " + board.getContent());
			System.out.println("작성자: " + board.getWriter());
			System.out.println("작성일자: " + board.getCreationDate());
			// 댓글
			List<BoardDB> list = service.getReply(boardNo);
			System.out.println("---------[댓글]--------------");

			for (BoardDB brd : list) {
				System.out.println("-> " + brd.getBoardNo() + " | " + brd.getContent() + " | " + brd.getCreationDate());
			}
			System.out.println("-----------------------------------");
			System.out.println("1.댓글작성 2.이전메뉴");

			int subMenu = 0;
			subMenu = sc.nextInt();
			sc.nextLine();
			if (subMenu == 1) {
				System.out.println("댓글제목입력 :");
				String replytitle = sc.nextLine();
				System.out.println("댓글 입력: ");
				String reply = sc.nextLine();
				BoardDB board1 = new BoardDB();
				board1.setTitle(replytitle);
				board1.setContent(reply);
				board1.setOrigNo(board.getBoardNo());
				board1.setWriter(loginId);
				service.insertReply(board1);
			} else {

				return;
			}
		} else {
			System.out.println("없는 글 번호입니다.");
			return;
		}
	}

	public void writeBoard() {// 글 작성

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

	public void getBoardList() {// 전체 조회
		System.out.println("전체글 조회");
		List<BoardDB> boards = service.getBoardList();
		for (BoardDB board : boards) {
			System.out.println(board);
		}
	}

	public void deleteBoard() {// 1건씩 삭제
		System.out.println("삭제할 글번호: ");
		int dbNo = sc.nextInt();
		sc.nextLine();

		BoardDB board = service.getBoard(dbNo);

		if (board == null) {
			System.out.println("없는 게시판");
		} else if (loginId.equals(board.getWriter())) {
			service.deleteBoard(dbNo);
			System.out.println("게시글이 삭제되었습니다.");
		} else {
			System.out.println("권한이 없습니다.");
		}

	}
	public void delBoard() {// 원본글이나 댓글까지 일괄 삭제 ex) 원본글에 댓글이 있을 경우 댓글까지 삭제
		BoardDB board = new BoardDB();
		System.out.println("삭제할 글번호: ");
		int dbNo = sc.nextInt();sc.nextLine();
		board.setBoardNo(dbNo);
		board.setOrigNo(board.getBoardNo());
		BoardDB bd = service.getBoard(dbNo);
		
		if (bd == null) {
			System.out.println("없는 게시글입니다.");
		} else if (loginId.equals(bd.getWriter())) {
			service.delBoard(board);
			System.out.println("게시글이 삭제되었습니다.");
		} else {
			System.out.println("권한이 없습니다.");
		}
		
		
		
		
	}
}
