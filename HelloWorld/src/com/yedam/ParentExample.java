package com.yedam;

class Child extends Parent {
	@Override
	void method1() {
		System.out.println("자식클래스의 메소드1");
	}
	@Override
	void method2() {
		System.out.println("자식클래스의 메소드2");
	}
	void method3() {
		System.out.println("자식클래스의 메소드3");
	}
}
public class ParentExample {
	public static void main(String[] args) {
		Child c1 = new Child();
//		c1.method1();
//		c1.method2();
//		c1.method3();
		Parent p1 = c1;
		if(p1 instanceof Child) {
		p1.method1();
		p1.method2();
		
		}
		Parent p2 = new Parent();
//		p2.method1();
//		p2.method2();
		if(p2 instanceof Child) {	//p2가 자식클래스의 메소드이면 실행	
		c1 = (Child) p2;
		c1.method1(); //불가능
		c1.method2(); //불가능
		c1.method3(); //불가능
		}
	}
}