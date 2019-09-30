package com.yedam;
class Calculator{
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}
class Computer extends Calculator{
	@Override //부모가 가지고 있는 메소드의 타입을 똑같이 상속받아서 재정의 하겠다.
	double areaCircle(double r) {
		return Math.PI * r * r;
	}
//	double areaCircle(double r) {
//		return super.areaCircle(r);
//	}
}
public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		Calculator cal = new Calculator();
		cal.areaCircle(100);
		com.areaCircle(100);
		System.out.println("자식메소드 반지름"+com.areaCircle(10));
		System.out.println("부모메소드 반지름"+cal.areaCircle(10));
	}
}
