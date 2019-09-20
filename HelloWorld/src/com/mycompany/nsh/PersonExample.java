package com.mycompany.nsh;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.setName("noh");
//		p1.setAge(20);
//		p1.setHeight(176.5);
//		p1.setWeight(77.5);
//		System.out.println("이름은 : "+p1.getName());
//		System.out.println("나이는 : "+p1.getAge());
//		System.out.println("키는 : "+p1.getHeight());
//		System.out.println("몸무게는 : "+p1.getWeight());
		
		Scanner sc = new Scanner(System.in);
		 String name;
		 int a;
		 double w, h;
		 System.out.println("이름 ? ");
		 name = sc.next();
		p1.setName(name);
		
		System.out.println("나이 ? ");
		a=sc.nextInt();
		p1.setAge(a);
		
		System.out.println("키는? ");
		h=sc.nextDouble();
		p1.setHeight(h);
		
		System.out.println("몸무게 ? ");
		w=sc.nextDouble();
		p1.setHeight(w);
		
		System.out.println(p1.getName()+p1.getAge()+p1.getHeight()+p1.getWeight());
		
	}
}
