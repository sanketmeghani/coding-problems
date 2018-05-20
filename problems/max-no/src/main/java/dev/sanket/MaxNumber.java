package dev.sanket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxNumber {

    public static String formMaxNumber(int[] input) {

        HashMap<Integer, List<Integer>> numberLists = new HashMap<>();

        IntStream.range(0, 10).forEach(n -> numberLists.put(Integer.valueOf(n), new ArrayList<>()));

        int maxNoOfDigits = String.valueOf(IntStream.of(input).max().getAsInt()).length();
        List<Integer> list = IntStream.of(input).boxed().collect(Collectors.toList());

        for (int index = maxNoOfDigits - 1; index >= 0; index--) {

            for (Integer num : list) {

                int digit = digitAt(num, index);
                numberLists.get(Integer.valueOf(digit)).add(num);
            }

            list = IntStream.range(0, 10).map(n -> 9 - n).boxed().flatMap(n -> numberLists.get(n).stream())
                    .collect(Collectors.toList());

            IntStream.range(0, 10).map(n -> 9 - n).boxed().map(numberLists::get).forEach(List::clear);
        }

        return list.stream().map(Object::toString).collect(Collectors.joining());
    }

    private static int digitAt(int number, int index) {

        String strNumber = String.valueOf(number);

        if (strNumber.length() > index) {
            return strNumber.charAt(index) - 48;
        }

        return strNumber.charAt(strNumber.length() - 1) - 48;
    }
}