package com.yedam;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[3];
		
		boolean run = true;
		int ran[] = {((int) (Math.random() * 9) + 1)
				, ((int) (Math.random() * 9) + 1) ,
				((int) (Math.random() * 9) + 1)};
		
		for(int r:ran)
			System.out.print(r+" ");

		System.out.println();
		
//		while (run) {
//			for (int i = 0; i < ran.length; i++) {
//				ran[i] = (int) (Math.random() * 9) + 1;
//			}
//			if (ran[0] != ran[1] && ran[0] != ran[2] && ran[1] != ran[2]) {
//				run = false;
//			}
//			
//		}
		
		for(int r:ran)
			System.out.print(r+" ");
		run = true;
		
		int st = 0;
		int ba = 0;
		
		while (run) {
			st = 0;
			ba = 0;
			
			System.out.println("1: ");
			in[0] = sc.nextInt();
			
			System.out.println("2: ");
			in[1] = sc.nextInt();	
			
			System.out.println("3: ");
			in[2] = sc.nextInt();	
			
			for (int i = 0; i < ran.length; i++) {
				for (int j = 0; j < in.length; j++) {
					if (ran[i] == in[j]) {
						if (i == j) {
							System.out.println(ran[i] + "스트라잌");
							st++;
						} else {
							System.out.println(ran[j] + "볼");
							ba++;
						}
					}
				}
				
			}
			System.out.println("======================");
		}
		
		if(st==3)
			run = false;

	}
}