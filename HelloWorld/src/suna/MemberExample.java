package suna;

import java.util.Scanner;

public class MemberExample {
	private static Member[] memberArray = new Member[50];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu=0;
		while(run) {
			System.out.println("1.회원등록 | 2.회원조회 | 3.등록그룹별리스트 | 4.종료");
			menu = sc.nextInt();sc.nextLine();
			if(menu==1) {
				createMember(); //회원 생성
			}else if (menu==2) {
				getMem();		//회원 조회
			}else if (menu==3) {
				getMember();	//등록그룹별 리스트
			}else if (menu==4) {
				run = false;	//종료
			}
		}System.out.println("프로그램 종료");
	}

	//멤버 인스턴스 만드는 메소드.
	public static void createMember() {
		System.out.println("id를 입력: ");
		String Id = sc.nextLine();
		System.out.println("사용자명 입력: ");
		String Name = sc.nextLine();
		System.out.println("등록과정: ");
		String reg = sc.nextLine();
		
		Member accnt = new Member(Id, Name, reg);
		for(int i=0;i<memberArray.length;i++) {
			if(memberArray[i]==null) {
				memberArray[i] = accnt;
				break;
			}
		}		
	}
	//멤버리스트 조회하는 메소드.
	public static void getMember() {
		System.out.println("getAccount");
		for(Member a : memberArray) {
			if(a != null)//null 값이 없을 경우에 실행하라
			System.out.println("아이디 : "+a.getId()+", 사용자: "+a.getName()+", 과정: "+a.getReg());
		}
	}
	//멤버 id 조회
	public static void getMem() {
		System.out.println("조회할 회원 입력: ");
		String Id = sc.nextLine();
		boolean isId = false;
		String name = null;
		String reg = null;
		for(Member m : memberArray) {
			if(m !=null&&m.getId().equals(Id)) {
					name = m.getName();
					reg = m.getReg();
					break;
		}
		if(isId==true && reg==m.getReg()) {
			System.out.println("이름은 : "+name+", 과정 : "+reg); 
						
		}else if(isId==false && reg==m.getReg()) {
			System.out.println("존재하지 않는 회원입니다.");
			
		}
	}	
	}


	public static Member findAccount(String ano) {
		return null;
	}
}

