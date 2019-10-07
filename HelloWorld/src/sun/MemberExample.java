package sun;

import java.util.Scanner;

import hello.Member;

public class MemberExample {
	private static Member[] mem = new Member[50];
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
		int Reg = sc.nextInt();
		
		Member accnt = new Member(Id, Name, Name, Reg);
		for(int i=0;i<mem.length;i++) {
			if(mem[i]==null) {
				mem[i] = accnt;
				break;
			}
		}		
	}
	//멤버리스트 조회하는 메소드.
	public static void getMember() {
		System.out.println("getAccount");
		for(Member a : mem) {
			if(a != null)//null 값이 없을 경우에 실행하라
			System.out.println("아이디 : "+a.getId()+", 사용자: "+a.getName()+", 과정: "+a.getId());
		}
	}
	//멤버 id 조회
	public static void getMem() {
		System.out.println("조회할 ID를 입력: ");
		String Id = sc.nextLine();
		System.out.println("조회할 pw를 입력: ");
		String Pswd = sc.nextLine();
		boolean isId = false, isPw=false;
		String name = null;
		int age=0;
		for(Member m : mem) {
			if(m !=null&&m.getId().equals(Id)) {
				if(m.getPassword().equals(Pswd)) {
					isId = true;
					isPw = true;
					name = m.getName();
					age = m.getAge();
					break;
				}else { //id 맞고 pw 틀리다
					isId=true;
					isPw=false;
					break;
				}
			}else { // id, pw 다 틀리다
				isId = false;
				isPw = false;
			}
			
		}
		if(isId==true && isPw == true) {
			System.out.println("이름은 : "+name+", 나이 : "+age); 
						
		}else if(isId==true && isPw==false) {
			System.out.println("패스워드가 틀립니다.");
			
		}else if(isId==false && isPw==false) {
			System.out.println("존재하지 않는 아이디입니다.");
			
		}
	}	


	public static Member findAccount(String ano) {
		return null;
	}
}

