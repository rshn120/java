package com.yedam.lambda;

import java.util.function.IntSupplier;

public class LambdaExample04 {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
//			x *= 10;

			int result = x + y;

			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}
}
