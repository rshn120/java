package com.yedam.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> memset = new HashSet<>();

//		memset.add(new Member("홍길동",30));
//		memset.add(new Member("김길동",20));
//		System.out.println("memset의 개수: "+ memset.size());
//		for(Member m : memset) {
//			System.out.println(m.name + "/"+m.age);
//		}
//		
		Set<String> set = new HashSet<>();
		set.add("hello");//0
		set.add("world");//1
		set.add("nice");//2
		set.add("java");//3
		set.add("world");//4
		System.out.println("객체수: "+set.size()); //총 값이 5개인데 중복값은 제외한 4개만 출력된다.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		
		}
		System.out.println("반복자 소진 후: ");
		iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.remove("nice");
		System.out.println("확장 for: ");
		for(String str : set) {
			System.out.println(str);
		}
	}
}
