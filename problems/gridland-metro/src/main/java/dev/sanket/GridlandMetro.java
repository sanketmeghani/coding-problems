package dev.sanket;

import java.util.Arrays;
import java.util.Comparator;

public class GridlandMetro {

    private static final class TrackComparator implements Comparator<long[]> {

        @Override
        public int compare(long[] o1, long[] o2) {

            if (o1[0] < o2[0]) {
                return -1;
            }

            if (o1[0] == o2[0]) {
                return o1[1] <= o2[1] ? -1 : 1;
            }

            return 1;
        }
    }

    public static long findNoOfLampposts(long n, long m, long k, long[][] track) {

        Arrays.sort(track, new TrackComparator());

        long count = 0;

        for (int i = 0; i < k; i++) {

            int j = i + 1;
            while ((j < k) && (track[i][0] == track[j][0]) && (track[i][2] >= track[j][1] - 1)) {
                track[i][2] = Math.max(track[i][2], track[j][2]);
                j++;
            }

            count = count + (track[i][2] - track[i][1] + 1);
            i = j - 1;
        }

        return (m * n) - count;
    }
    
    private static long rowOf(long[] track) {
        return track[0];
    }
    
    private static long startingPointOf(long[] track) {
        return track[1];
    }
    
    private static long terminationPointOf(long[] track) {
        return track[2];
    }
}
