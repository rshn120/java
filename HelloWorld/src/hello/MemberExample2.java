package hello;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] memberArray = new Member[50];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu=0;
		while(run) {
			System.out.println("1.id생성 2.전체리스트 3.id조회 4.종료");
			menu = sc.nextInt();sc.nextLine();
			if(menu==1) {
				createMember();
			}else if (menu==2) {
				getMember();
			}else if (menu==3) {
				getMem();
			}else if (menu==4) {
				run = false;
			}
		}System.out.println("프로그램 종료");
	}

	//멤버 인스턴스 만드는 메소드.
	public static void createMember() {
		System.out.println("id를 입력: ");
		String Id = sc.nextLine();
		System.out.println("사용자명 입력: ");
		String Name = sc.nextLine();
		System.out.println("비밀번호 입력: ");
		String Pswd = sc.nextLine();
		System.out.println("나이: ");
		int Age = sc.nextInt();
		
		Member accnt = new Member(Id, Name, Pswd, Age);
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
			System.out.println("아이디 : "+a.getId()+", 사용자: "+a.getName()+", 비밀번호: "+a.getPassword()+", 나이: "+a.getAge());
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
		for(Member a : memberArray) {
			if(a !=null&&a.getId().equals(Id)) {
				if(a.getPassword().equals(Pswd)) {
					isId = true;
					isPw = true;
					name = a.getName();
					age = a.getAge();
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
			
//			if(a!= null && a.getId().equals(Id) && a.getPassword().equals(Pswd)) {
//				//id랑 pw 같으면 출력
//				System.out.println("사용자: "+a.getName()+", 나이: "+a.getAge());
//				break;
//			}else if(a!=null && a.getId().equals(Id)) {//pw만 다를 경우 
//				System.out.println("패스워드가 틀렸습니다.");
//				break;
//			}else if(a!=null && a.getPassword().equals(Pswd)) {//id가 다를경우
//				System.out.println("ID가 틀렸습니다.");
//				break;
//			}else if(a!=null && a.getPassword().equals(Pswd)) {//id, pw가 다를경우
//				System.out.println("ID가 틀렸습니다.");
//				break;
//			}
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
