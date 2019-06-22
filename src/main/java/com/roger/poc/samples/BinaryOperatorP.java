package com.roger.poc.samples;

import java.util.function.BinaryOperator;

public class BinaryOperatorP {
	public Long useBinaryOperator(long num1, long num2) {
		BinaryOperator<Long> operator = (x, y) -> x + y;
		return operator.apply(num1, num2);
	}
}
