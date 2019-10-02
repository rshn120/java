package com.yedam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
						
		//객체 저장
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("김길동", 60);
		map.put("홍길동", 50); //홍길동에 80을 90으로 덮어씀
		System.out.println("Entry갯수 : "+map.size());//엔트리 갯수가 4개가 아니라 3개로 나옴 중복 키의 값은 뒤에껄로 덮어씀
		System.out.println("방법1");//key를 set에 담에서 iterator로 가져옴.
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println("key: "+key+", value: "+map.get(key));
		}
		
	}
}
