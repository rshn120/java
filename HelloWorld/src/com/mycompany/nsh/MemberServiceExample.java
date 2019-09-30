package com.mycompany.nsh;

public class MemberServiceExample {

	public static void main(String[] args) {
		
	MemberService mem= new MemberService();
	
	boolean result = mem.login("hong","12345");
	if(result) {
		System.out.println("로그인 되었습니다.");
	}
	else {
		System.out.println("id또는 password가 올바르지 않습니다.");
	}
	}

}