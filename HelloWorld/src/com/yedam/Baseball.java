package com.yedam;

import java.util.Scanner;

public class Baseball {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ran = {(int)(Math.random()*9)+1,
				(int)(Math.random()*9)+1, 
				(int)(Math.random()*9)+1};
		int[] in = new int[3];
		int st=0;
		int ba=0;
		boolean run= true;
		System.out.println("1번 : ");
		in[0] = sc.nextInt();
		System.out.println("2번 : ");
		in[1] = sc.nextInt();
		System.out.println("3번 : ");
		in[2] = sc.nextInt();
		
		while(run) {
		for(int i=0;i<ran.length;i++) {
			for(int j=0; j <= in.length;j++) {
				if(ran[i] == in[i]&&i==j) {
//				System.out.println(ran[i]+"스트라잌");
				st++;
				}
				else if(ran[i] != in[i]&&i==j) {
			//	System.out.println(ran[i]+"볼");
				ba++;
				//break;
				}
			}System.out.println(st+"스트라잌");
		}System.out.println("======================");
}

}
