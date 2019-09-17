package hello;

import java.util.Scanner;

public class Exercise509 {
	public static void main(String[] args) {
		boolean run = true;
		int stdNum = 0;  //학생수
		int[] scores = null; // 점수
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				stdNum = sc.nextInt();
				System.out.println("학생수> " + stdNum);
			} else if(selectNo == 2) {
				//2
			} else if(selectNo == 3) {
				//3
			} else if(selectNo == 4) {
				//4
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
