package hello;

import java.util.Scanner; //외부 패키지의 클래스를 불러옴.
public class Exercise407 {
public static void main(String[] args) {
	boolean run = true; //true 값일 때 실행하라!
	
	int balance = 0; //balance에 0을 넣어 초기화 해준다.
	
	Scanner scanner = new Scanner(System.in); //scanner 함수 선언
	
	while(run) { //run 값이 true라서 실행, false를 만나면 종료
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-------------------------------");
		System.out.print("선택> ");
		
		int cb = scanner.nextInt(); //cb 함수로 입력받는다.
		
		if(cb == 1) { //입력 받은 숫자가 1인지 비교 맞으면 실행
			System.out.print("예금액> ");
			balance += scanner.nextInt(); //balance 값 0에서 입력받는 숫자를 더해서 balance에 넣는다.
			System.out.println("현재 금액> "+balance);
		} else if(cb == 2) { //입력받는 숫자가 2인지 비교 맞으면 실행
			System.out.print("출급액> ");
			balance -= scanner.nextInt(); //위에서 입력 받은 숫자가 들어간 balance값에 입력 받는 숫자값을 빼서 balance에 저장
			System.out.println("현재 금액> "+balance);
		} else if(cb == 3) { //입력받는 숫자가 3인지 비교 맞으면 실행
			System.out.println("잔고> "+balance);// balance에 남아있는 값을 출력
		} else if(cb == 4) {// 입력받은 값이 4이면 false를 만나 종료한다.
			run = false;
		}
		
		
	}
	System.out.println("프로그램 종료");
}
}
