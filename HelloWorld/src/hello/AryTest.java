package hello;

import java.util.Scanner;

public class AryTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*		System.out.println("input int type: ");
		int a = sc.nextInt();
		System.out.println("next input: ");
		int b = sc.nextInt();
		System.out.println("next input: ");
		int c = sc.nextInt();
		int sum = a+b+c;
		System.out.println("합은 : "+sum);
*/	
		int[] intary = new int[5];
		int sum=0;
		for(int i=0;i<intary.length;i++) {
			System.out.println("값을 입력하세요: ");
		//	int a = sc.nextInt();
			intary[i] = sc.nextInt();	
		}	
		
		for(int i=0;i<intary.length;i++) {
		sum += intary[i];
		}
		System.out.println("입력값의 합은 : "+sum);
		sc.close();
		
	}

}
