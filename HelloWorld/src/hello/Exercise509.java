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
			} else if(sNo == 2) { //scr  점수
				for(int i=0;i<stdNum;i++) {
					System.out.println("scores["+i+"]> ");
					int scr=sc.nextInt();
					scr[i]=scr;
				}
				
			} else if(sNo == 3) {	//3 리스트
				for(int i=0;i<stdNum;i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
			} else if(sNo == 4) {	//4 분석
				int max=0, sum=0, avg=0;
				for(int i=0;i<stdNum;i++) {
					sum += scr[i];
					for(int j=0; j<scr[i];j++) {
						max=scr[i];
					}
					avg=sum/stdNum;
					System.out.println("최고 점수: "+max);
					System.out.println("평균 점수: "+avg);
				}
			} else if(sNo == 5) {   //종료
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		
		sc.close();
	}

}
