package com.yedam.generic;

public class BoxingMethod {
	public static void main(String[] args) {
//		Integer intVlaue = 10; //원래는 아래와 같이 값을 넣어줘야 하는데 제네릭을 씀으로써 가능하다
		Integer intValue = new Integer(10);
		Box<Integer> box = Util.boxing(intValue);
		System.out.println(box.getObj());
		
		Box<String> strBox = Util.boxing("Hello");
		strBox.getObj();
		System.out.println(strBox.getObj());
	}
}
