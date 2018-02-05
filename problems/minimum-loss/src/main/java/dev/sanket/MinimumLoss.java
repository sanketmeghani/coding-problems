package dev.sanket;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumLoss {

    public static int minimumLoss(long[] price) {

        long[] copy = Arrays.copyOf(price, price.length);
        Arrays.sort(copy);

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < price.length; i++) {
            map.put(price[i], i);
        }

        int minLoss = Integer.MAX_VALUE;

        for (int i = copy.length - 1; i > 0; i--) {
            if (map.get(copy[i]) < map.get(copy[i - 1]) && (copy[i] - copy[i - 1] < minLoss)) {
                minLoss = (int) (copy[i] - copy[i - 1]);
            }
        }

        return minLoss;
    }
}
