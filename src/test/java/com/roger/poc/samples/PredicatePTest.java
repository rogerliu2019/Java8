package com.roger.poc.samples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

public class PredicatePTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testUsePredicate() {
		PredicateP predicateP = new PredicateP();
		Assert.isTrue(predicateP.usePredicate(6), "Not satisfied with predicate");
	}

}
