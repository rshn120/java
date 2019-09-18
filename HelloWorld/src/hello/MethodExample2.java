package hello;

import java.util.Scanner;

public class MethodExample2 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;  //학생수, 책에는 studentNum
		int[] scores = null; // 점수, 책에는 scores
		Scanner sc = new Scanner(System.in); //책에는 scanner
		
		while(run) { //조건이 참이라 실행 ~
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			if(selectNo==1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
			}
			else if(selectNo==2) {
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> ");
					scores[i] = sc.nextInt();
				}
			}
			else if(selectNo==3) {
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores["+scores[i]+"]> ");
				}
			}
			else if(selectNo==4) {
				int max=0, sum=0;
				double avg=0.0;
				for(int i=0; i<scores.length;i++) {
					max = (max>scores[i] ? max : scores[i]);
					sum += scores[i];
					
				} avg= (double) sum / scores.length;
				System.out.println("최대값은 : "+max);
				System.out.println("평균값은 : "+avg);
			}
			else if(selectNo==5) {
				run = false;
			}
			

	}
	}
}
