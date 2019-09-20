package classes;

import java.util.Scanner;

public class PayExample {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("환전 금액을 입력하세요.");
//		int i = sc.nextInt();
//		System.out.println(i+"원 받았습니다.");
//		System.out.println("오만원 "+i/50000 + "매");
//		System.out.println("만원권"+(i%50000/10000) + "매");
//		System.out.println("오천원권 "+((i%50000)%10000)/5000 + "매");
//		System.out.println("천원권 "+(((i%50000)%10000)%5000)/1000 + "매");
//		System.out.println("오백원권 "+((((i%50000)%10000)%5000)%1000)/500 + "개");
//		System.out.println("백원권 "+(((((i%50000)%10000)%5000)%1000)%500)/100 + "개");
//		System.out.println("오십원권 "+((((((i%50000)%10000)%5000)%1000)%500)%100)/50 + "개");
//		System.out.println("십원권 "+(((((((i%50000)%10000)%5000)%1000)%500)%100)%50)/10 + "개");
//		System.out.println("일원권 "+((((((((i%50000)%10000)%5000)%1000)%500)%100)%50)%10)/1 + "개");

		Scanner sc = new Scanner(System.in);
		System.out.println("환전 금액을 입력하세요.");
		int i = sc.nextInt();
		int[] dan = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		for(int a=0;a<dan.length;a++) {
			System.out.println(dan[a]+" 원은 "+i/dan[a]+" 개");
			i %= dan[a];
		}sc.close();
	}

}
