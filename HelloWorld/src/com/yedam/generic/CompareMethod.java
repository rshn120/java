package com.yedam.generic;
//page 665
public class CompareMethod {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple", 10);
		Pair<String, Integer> p2 = new Pair<>("apple", 10);
		boolean result =  Util.compare(p1, p2);
		Pair<String, String> pa1 = new Pair<>("user1","orange");
		Pair<String, String> pa2 = new Pair<>("user2","orange");
		boolean result2 = Util.compare(pa1, pa2);
		Pair<String, String> p3 = new Pair<>("orange","good");
		Pair<String, String> p4 = new Pair<>("apple","good");
		boolean result3 = Util.compareValue(p3, p4);
//		if(result)
//			System.out.println("두 객체가 논리적으로 동일함.");
//		else
//			System.out.println("두 객체가 논리적으로 동일하지 않음.");	
//		
//		if(result2)
//			System.out.println("두 객체가 논리적으로 동일함.");
//		else
//			System.out.println("두 객체가 논리적으로 동일하지 않음.");
//		if(result3)
//			System.out.println("두 객체가 논리적으로 동일함.");
//		else
//			System.out.println("두 객체가 논리적으로 동일하지 않음.");
//		
		Integer intV1 = Util.compare(12.3, 2.3);
		System.out.println(intV1);

	
	}
}
