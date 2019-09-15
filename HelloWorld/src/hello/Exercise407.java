package hello;

import java.util.Scanner; //외부 패키지의 클래스를 불러옴.
public class Exercise407 {
public static void main(String[] args) {
	boolean run = true;
	
	int balance = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-------------------------------");
		System.out.print("선택> ");
		
		int cb = scanner.nextInt();
		
		if(cb == 1) {
			System.out.print("예금액> ");
			balance += scanner.nextInt();
		} else if(cb == 2) {
			System.out.print("출급액> ");
			balance -= scanner.nextInt();
		} else if(cb == 3) {
			System.out.println("잔고> "+balance);
		} else if(cb == 4) {
			run = false;
		}
		
		
	}
	System.out.println("프로그램 종료");
}
}
