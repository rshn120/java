package com.yedam.generic;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동",35);
		Integer age = Util.getValue(pair,"홍길동");
		System.out.println(age);
		Pair<Integer, String> p2 = new Pair<>(10,"홍길동");
		String returnVal = Util.getValue(p2, 12);
		System.out.println(returnVal);
		
//		Util.getValue(p2, 10);
		
//		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원",20);
//		Integer childAge = Util.getValue(childPair,"홍삼순");
//		System.out.println(childAge);
//		
//		int otherAge = Util.getValue(otherPair,"홍삼원");
//		System.out.println(otherAge);
}
	
//	static <K,V> void getValue(Pair<K,V> p , V s) {
//		
//	}
}
