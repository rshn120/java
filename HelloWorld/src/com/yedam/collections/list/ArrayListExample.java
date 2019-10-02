package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//List 인터페이스를 구현하는 ArryaList 클래스.
		List<String> list = new ArrayList<>();
		//        list는 변수이름        배열쓸때는 new String[10];
		list.add("Hello");
		list.add("World");
		list.add("Nice");
		list.add("Java");
		list.add(2,"Inset"); //index 2번째 자리에 삽입할 수 도 있다 기존 값을 엎는게 아니라 한칸씩 밀어 낸다.
		int size = list.size(); //length랑 같은 표현
		System.out.println("객체 수는 "+size);
		for(int i=0; i< size; i++){
			System.out.println("index: "+i+", "+list.get(i));
			
		}
		String returnVal = list.remove(2);
		System.out.println("return: "+returnVal);
		for(int i=0; i< list.size(); i++){//list.size() == list.length
			System.out.println("index: "+i+", "+list.get(i));
			
		}
//		for(String str : list) {
//			System.out.println(str);
//		}
	}
}
