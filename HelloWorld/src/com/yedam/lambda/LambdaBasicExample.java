package com.yedam.lambda;
@FunctionalInterface 
interface MyInterface{
	int print(int a, int b); //구현하는 부분이 없는 추상 클래스
}
class MyInterfaceClass implements MyInterface {

	@Override
	public int print(int a, int b) {
		return a+b;
	}
	
}
public class LambdaBasicExample {
	public static void main(String[] args) {
		MyInterface mi = new MyInterfaceClass(); //mi에다 MyInterfaceClass()라는 인스턴스를 넣어준다.
		int result = mi.print(4, 9);
		System.out.println("결과값은: "+result);
		
		mi = (a, b)-> {	
			return a* b;
		};//람다 표현식
		
		
		mi = (c, d) -> {
			int re = 0;
			re = c * d;
			return re;
		};
		
		
		result = mi.print(3, 5);
		System.out.println("결과값 : "+result);
		
		mi = new MyInterface() {	
		@Override
		public int print(int a, int b) {
			return a-b;
		}
		};
		result = mi.print(7, 4);
		System.out.println("결과값 : "+result);
		
		//mi.print(4, 8) --> "결과값은 2 입니다." 나오게해
		mi = (a, b) -> {return a/b;};
		System.out.println("결과값은: "+mi.print(8, 4));
		
	}
}

