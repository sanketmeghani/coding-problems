package dev.sanket;

public class CounterGame {

    public static String counterGame(long n) {

        boolean lousiseWins = false;

        while (n != 1) {

            boolean isPowerOfTwo = isPowerOfTwo(n);

            if (isPowerOfTwo) {
                n = n / 2;
            } else {
                n = n - nextLowerPowerOfTwo(n);
            }

            lousiseWins = !lousiseWins;
        }

        return lousiseWins ? "Louise" : "Richard";
    }

    private static long nextLowerPowerOfTwo(long n) {

        long value = 1;
        long maxPowerOfTwo = 1;

        do {
            value = value << 1;
        } while (value < n);

        return maxPowerOfTwo;
    }

    private static boolean isPowerOfTwo(long n) {
        return (n & (n - 1)) == 0 ? true : false;
    }
}
