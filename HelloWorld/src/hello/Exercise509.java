package hello;

import java.util.Scanner;

public class Exercise509 {
	public static void main(String[] args) {
		boolean run = true;
		int stdNum = 0;  //학생수
		int[] scr = null; // 점수
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int sNo = sc.nextInt();
			
			if(sNo == 1) {
				stdNum = sc.nextInt();
				scr = new int[stdNum];
				System.out.println("학생수> " + stdNum);
			} else if(sNo == 2) {
				//scr  점수 작성부분
				
			} else if(sNo == 3) {
				//3
			} else if(sNo == 4) {
				//4
			} else if(sNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
