package com.yedam.exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "10";
		String data2 = "20";
		
		int val1 = Integer.parseInt(data1); //Integet.parseInt가 문자열을 숫자열로 변환해 준다. 문자형 숫자만 가능
		int val2 = Integer.parseInt(data2);
		System.out.println("sum: "+(val1+val2));
	}
}
