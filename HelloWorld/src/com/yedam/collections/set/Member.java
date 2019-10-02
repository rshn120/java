package com.yedam.collections.set;

import java.util.Set;

public class Member {
	String name; //필드
	int age; //필드
	
	public Member(String name, int age) { //생성자
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if(obj instanceof Member) {
			Member mem = (Member) obj;
//			return mem.name.equals(this.name);// && mem.age==this.age;
			return mem.age==this.age;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return age;
//		return this.name.hashCode();// + age;
		
	}
	
	
}
