package hello;

public class IfExample {
	public static void main(String[] args) {
		
	//	int a = 90; 
		/*
		if(a>50 && a>100) { // ||(or)둘 중에 하나만 참이면 참, &&(and) 둘다 참일때 참
			System.out.println("50 이상.");
			System.out.println("좋은 점수네요.");
			
		}
		if (a>100) {
			System.out.println("만점입니다.");
		} */
	
	int a = 90;
		if(a>=90) {
		System.out.println("A");
		} else if (a>80) {
			System.out.println("B");
		} else if (a>70) {
			System.out.println("C");
		} else if (a>60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
}
