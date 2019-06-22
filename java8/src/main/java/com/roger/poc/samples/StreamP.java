package com.roger.poc.samples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamP {
	public long getCount() {
		Stream<String> raw = Stream.of("Roger", "Nadal", "Drokovic", "Murray", "Roddick", "Nalbandian", "Safin",
				"Gozalez", "Sodlin", "Davedenko");
		return raw.filter(i -> i.startsWith("R")).map(name -> {
			StringBuilder buffer = new StringBuilder(name);
			System.out.println(buffer);
			return buffer.reverse().toString().toUpperCase();
		}).count();
	}

	public long getCountOfMultipleStreams() {
		List<Integer> arr1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> arr2 = Arrays.asList(11, 223, 321, 11, 222);

		return Stream.of(arr1, arr2).flatMap(item -> item.stream()).count();
	}

	public long getMax() {
		List<Integer> arr1 = Arrays.asList(11, 223, 321, 11, 222);
		return arr1.stream().max(Comparator.comparingInt(i -> i)).get();
	}

	public long getReduce(long... numbers) {
		LongStream stream = Arrays.stream(numbers);
		return stream.reduce(1, (base, element) -> base * element);
	}

}
