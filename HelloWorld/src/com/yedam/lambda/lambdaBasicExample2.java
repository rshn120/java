package com.yedam.lambda;

interface MyInterfaceNoArgs {
	public void method1();
}

interface MyInterfaceWithArgs {
	public void method2(int a);
}

interface MyInterfaceWithRetun {
	public int method3(int a, int b);
}

public class lambdaBasicExample2 {
	public static void main(String[] args) {
//		MyInterfaceNoArgs fina = new MyInterfaceNoArgs() {
		MyInterfaceNoArgs fina = () -> {
			System.out.println("no arguments expression.");
			};
			fina.method1();
			
		
	MyInterfaceWithArgs fiwa = (num) -> {
		System.out.println("result is "+(num*3));
		
	};fiwa.method2(5);
	
	MyInterfaceWithRetun fiwr = (a,b)-> {
		return a + b;
	};
	int result = fiwr.method3(5,10);
	System.out.println("결과값은 : "+result);
	


	}
}
	


