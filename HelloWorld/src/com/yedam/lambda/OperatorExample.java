package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for (int socre : scores) {
			result = oper.applyAsInt(result, socre);
			       //oper.applyAsInt(왼쪽 값, 오른쪽 값)
		}
		return result;

	}

	public static void main(String[] args) {
		// 최대값 얻기 == 람다식 (큰값 리턴)
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값 : " + max);
		// 최소값 얻기 == 람다식 (작은값 리턴)
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값 : " + min);

	}
}
