package com.yedam.exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String str=null;
		if(str!=null) //null값을 출력할때는 오류가 난다. 그래서 예외 처리를 해줘야 된다. 
		System.out.println(str.toString());
	}
}
