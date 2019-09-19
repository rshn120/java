package classes;

import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1번째 입력:");
		int a = sc.nextInt();
		System.out.print("2번째 입력:");
		int b = sc.nextInt();
		Calculator cal = new Calculator();	
		cal.execute(a, b);
		
		sc.close();
	}
}
