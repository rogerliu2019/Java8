package com.roger.poc.samples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

public class BinaryOperatorPTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testUseBinaryOperator() {
		BinaryOperatorP binaryOperatorP = new BinaryOperatorP();
		Assert.isTrue(9 == binaryOperatorP.useBinaryOperator(4, 5), "Failed to test binary operator.");
	}

}
