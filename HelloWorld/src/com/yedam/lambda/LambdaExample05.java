package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class LambdaExample05 {

	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for(int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin((x,y)->{
			if ( x >= y)
				return x;
			else 
				return y;
		});
		System.out.println("최대값: "+max);
		
		int min = maxOrMin((x,y)->{
			if (x<=y)
				return x;
			else
				return y;
		});
		System.out.println("최소값: "+min);
		
	}
}
