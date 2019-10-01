package com.yedam.generic;

public class Box<T> {//<T>는 제네릭 타입이라는 선언
		// 알파벳 대문자로 아무거나 쓰면 된다.
	private T obj;//object type 필드

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
