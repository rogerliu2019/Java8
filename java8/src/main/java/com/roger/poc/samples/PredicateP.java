package com.roger.poc.samples;

import java.util.function.Predicate;

public class PredicateP {
	public boolean usePredicate(int number) {
		Predicate<Integer> atLeast = x -> x > 5;
		return atLeast.test(number);
	}
}
