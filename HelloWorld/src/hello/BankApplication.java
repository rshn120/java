package hello;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();	
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run=false;
			}
			else continue;
		}System.out.println("프로그램 종료");
	}
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		
		System.out.println("계좌번호: ");
		String ano=sc.next();
		
		System.out.println("출금액: ");
		int balance = sc.nextInt();
		
		Account account = findAccount(ano);
		
		if(account==null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		if(account.getBalance()-balance<0) {
			System.out.println("출금액이 예금액을 초과합니다.");
			return;
		}
		account.setBalance(account.getBalance()-balance);
		System.out.println("결과: 출금이 성공되었습니다.");
		
	}
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		
		System.out.println("계좌번호");
		String ano=sc.next();
		
		System.out.println("예금액: ");
		int balance=sc.nextInt();
		
		Account account=findAccount(ano);
		
		if(account==null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()+balance);
		System.out.println("결과: 입금이 성공되었습니다.");
	}
	private static Account findAccount(String ano) {
		Account account=null;
		for(int i=0;i<accountArray.length;i++) {
			String dbAno=accountArray[i].getAno();
			if(dbAno.equals(ano)) {
				account=accountArray[i];
				break;
			}
		}return account;
	} 
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		
		for(int i=0;i<accountArray.length;i++) {
			Account account=accountArray[i];
			if(account!=null) {
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌번호: ");
		String ano=sc.next();
		
		System.out.print("계좌주: ");
		String owner=sc.next();
		
		System.out.print("초기입금액: ");
		int balance=sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				System.out.println("결과: 계조가 생성되었습니다.");
				break;
			}
		}
		
	}
}
