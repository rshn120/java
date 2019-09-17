package hello;
import java.util.Scanner;
public class Exercise509 {
	public static void main(String[] args) {
		boolean run = true;
		int stdn = 0;  //학생수, 책에는 studentNum
		int[] scr = null; // 점수, 책에는 scores
		Scanner sc = new Scanner(System.in); //책에는 scanner
		
		while(run) { //조건이 참이라 실행 ~
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt(); 
			
			if(selectNo == 1) {
				System.out.println("학생수> ");
				stdn = sc.nextInt(); //학생수 : 배열 갯수를 입력 받는다.
				scr = new int[stdn]; //학생수 배열을 scores에 넣는다.
			}		
			else if(selectNo == 2) {	// 점수
				for(int i=0;i<stdn;i++) {//i가 학생수 보다 많을때까지 돌아라
					System.out.println("scores["+i+"]> ");
					int a=sc.nextInt(); //점수를 입력받기 위해 int a 선언
					scr[i]=a; //a로 받은 값을 scores 배열로 넣어줌
				}				
			} 
			else if(selectNo == 3) {	//3 리스트
				for(int i=0; i<stdn; i++) { //i가 학생수 보다 많을때까지 돌아라
					System.out.println("scores["+i+"]:"+scr[i]);
				}
			} 
			
			else if(selectNo == 4) {	//4 평균
				int max=0, sum=0;
				double avg=0; // 평균은 소수점이라 int로 하면 안된다.
				for(int i=0; i<stdn; i++) {//i가 학생수 보다 많을때까지 돌아라
					sum += scr[i]; // 입력받은 점수를 더해서 sum에 넣어라
					if(scr[i]>max) //입력 받은 점수가 max값보다 클때 까지 돌아~
						max = scr[i]; //가장 큰 점수를 맥스에 넣어라 표현하기가 애메하네
				}
				avg=(double)sum/stdn; //총합 나누기 학생수 소수점때문에  int 형 sum을 double로 변환 이거 안하면 오류
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			} 
			
			else if(selectNo == 5) {   //5  종료
				run = false;
				System.out.println(" 프로그램 종료 ");			
			}	
			}sc.close();
		}
	}


