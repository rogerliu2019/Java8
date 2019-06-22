package com.roger.poc.samples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

public class StreamPTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetCount() {
		StreamP streamP = new StreamP();
		Assert.isTrue(streamP.getCount() == 2L, "Result is not 2");
	}

	@Test
	public final void testGetCountOfMultipleStreams() {
		StreamP streamP = new StreamP();
		Assert.isTrue(streamP.getCountOfMultipleStreams() == 9L, "Result is not 9");
	}

	@Test
	public final void testGetMax() {
		StreamP streamP = new StreamP();
		Assert.isTrue(streamP.getMax() == 321L, "Result is not 321");
	}

	@Test
	public final void testGetReduce() {
		StreamP streamP = new StreamP();
		Assert.isTrue(streamP.getReduce(3, 8, 9, 12, 13) == 3 * 8 * 9 * 12 * 13L, "Result is not 3 * 8 * 9 * 12 * 13L");
	}

}
