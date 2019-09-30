package com.yedam.exception;

public class ThrowsExample {
	public static void main(String[] args) {
			findClass();
			System.out.println("findClass() 호출 후.");
	}
	public static void findClass() {
		Class clazz = null;
		try {
			clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		
		
	}
}
