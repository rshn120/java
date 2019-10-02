package com.yedam.generic;

public class Container<T,V> {
	private T t;
	private V v;

	public Container(T t, V v) {
		super();
		this.t = t;
		this.v = v;
	}

	public Container() {
		// TODO 자동 생성된 생성자 스텁
	}

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	public String getKey() {
		return null;
	}

	public String getValue() {
		return null;
	}

	
}
