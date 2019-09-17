package hello;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0;
		int[] aAry = new int[5];
		
		for(int i=0;i<aAry.length;i++) {
			System.out.println("정수값을 입력: ");
			aAry[i] = sc.nextInt();
		}
		for(int i=0; i<aAry.length;i++) {
//			max = (max > aAry[i] ? max : aAry[i]); 
		// max값이 크면 max값을 max에 넣고 aAry[i] 입력받은 값이 크면 aAry[i]값을 max에 넣는다.
			if(max < aAry[i])
				max = aAry[i];
		}
		System.out.println("큰 값은 : "+max);
		sc.close();
	}
}
//		for(int i=0; i < aAry.length; i++) {
//			System.out.println("첫번째 값을 입력.");
//			aAry[i] = sc.nextInt(i);
//
//			for(int i=0;i >= aAry[i]; i++) {
//				max = aAry[i];
//		}
//		System.out.println("가장 큰값은 : "+max);
//		
//		} sc.close();
//	}
//}
