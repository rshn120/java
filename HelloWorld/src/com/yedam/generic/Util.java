package com.yedam.generic;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setObj(t);
		return box;
	}
	
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V>p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;
	}
	
	public static <K,V> boolean compareValue(Pair<K,V> v1, Pair<K,V>v2) {
		boolean boo1 = v1.getValue().equals(v2.getValue());
		return boo1;
	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();//Number의 doubleValue() 메소드 사용
		double d2 = t2.doubleValue();//Number의 doubleValue() 메소드 사용
		return Double.compare(d1, d2);
	}
	public static <K,V> V getValue(Pair<K,V> p, K s) {
		if(p.getKey().equals(s)) {
			return p.getValue();
		}else {
			return null;
		}
	}
	
}
