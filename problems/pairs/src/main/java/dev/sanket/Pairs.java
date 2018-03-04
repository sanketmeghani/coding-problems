package dev.sanket;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pairs {

	public static int calculatePairs(int k, int[] arr) {

		Set<Integer> values = new HashSet<>();

		int pairsCount = Arrays.stream(arr).reduce(0, (noOfPairs, number) -> {

			if (values.contains(number + k)) {
				noOfPairs++;
			}

			if (values.contains(number - k)) {
				noOfPairs++;
			}

			values.add(number);

			return noOfPairs;
		});

		return pairsCount;
	}
}
