package hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setId("nsh");
		m1.setName("상현");
		m1.setPassword("12345");
		m1.setAge(41);
		
		Member m2 = new Member("관리자","admin");
		m2.setPassword("admin123");
		m2.setAge(0);
		
		Member m3 = new Member("사용자","user1","user123",10);
		Member[] memberAry = {m1,m2,m3};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 이름 입력 : ");
		String name = sc.nextLine();
		for(Member m:memberAry) {
			if(m.getName().equals(name))
				System.out.println("==>"+m.getName()+","+m.getAge()+","+m.getPassword()+","+m.getId());
		}
		
	}
}
