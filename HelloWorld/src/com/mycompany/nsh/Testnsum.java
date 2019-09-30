package com.mycompany.nsh;

import java.util.Scanner;

public class Testnsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] b = new long[(int)n];
 		long sum = 0;
		
		for(long i = 0; i <= b.length; i++) {
			sum =(sum +i);
			
		}
		System.out.println(sum);
		
		
	}

}
