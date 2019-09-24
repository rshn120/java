package hello;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] accArray = new Member[50];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("1.id생성 2.전체리스트 3.id조회 4.종료");
			int menu = sc.nextInt();sc.nextLine();
			if(menu==1) {
				createAccount();
			}else if (menu==2) {
				getAccount();
			}else if (menu==3) {
				deposit();
			}else if (menu==4) {
				run = false;
			}
		}System.out.println("프로그램 종료");
	}

	//멤버 인스턴스 만드는 메소드.
	public static void createAccount() {
		System.out.println("생성 id를 입력: ");
		String accId = sc.nextLine();
		System.out.println("생성 사용자명 입력: ");
		String accName = sc.nextLine();
		System.out.println("생성 비밀번호 입력: ");
		String accPswd = sc.nextLine();
		System.out.println("생성 나이: ");
		int accAge = sc.nextInt();
		
		Member accnt = new Member(accId, accName, accPswd, accAge);
		for(int i=0;i<accArray.length;i++) {
			if(accArray[i]==null) {
				accArray[i] = accnt;
				break;
			}
		}		
	}
	//멤버리스트 조회하는 메소드.
	public static void getAccount() {
		System.out.println("getAccount");
		for(Member a : accArray) {
			if(a != null)//null 값이 없을 경우에 실행하라
			System.out.println("아이디 : "+a.getId()+", 사용자: "+a.getName()+", 비밀번호: "+a.getPassword()+", 나이: "+a.getAge());
		}
	}
	//멤버 id 조회
	public static void deposit() {
//		System.out.println("ID 조회");
		System.out.println("조회할 ID를 입력: ");
		String accId = sc.next();
		System.out.println("조회할 pw를 입력: ");
		String accPswd = sc.next();
		for(Member a : accArray) {
			if(a!= null && a.getId().equals(accId) && a.getPassword().equals(accPswd)) {
				
				System.out.println("사용자: "+a.getName()+", 나이: "+a.getAge());
				break;
			}else if(a!=null && a.getId().equals(accId)) {
				System.out.println("패스워드가 틀렸습니다.");
				break;
			}else if(a!=null && a.getPassword().equals(accPswd)) {
				System.out.println("ID가 틀렸습니다.");
				break;
			}
				
		}
	}
	public static Member findAccount(String ano) {
		return null;
	}
}
