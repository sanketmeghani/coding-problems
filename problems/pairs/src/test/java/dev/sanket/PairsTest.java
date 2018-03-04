package dev.sanket;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PairsTest {

	private int k;

	private int[] arr;

	@Parameter(value = 0)
	public String inputFileName;

	@Parameter(value = 1)
	public int noOfPairs;

	@Parameters
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] { { "/input1.txt", 3 } });
	}

	private void readInputs(String fileName) {

		try (Scanner in = new Scanner(PairsTest.class.getResourceAsStream(fileName))) {

			int n = in.nextInt();
			k = in.nextInt();
			arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
		}
	}

	@Test
	public void shouldReturnPairsCount() {
		readInputs(inputFileName);

		int noOfPairs = Pairs.calculatePairs(k, arr);

		assertEquals("Invalid no of pairs", this.noOfPairs, noOfPairs);
	}
}
