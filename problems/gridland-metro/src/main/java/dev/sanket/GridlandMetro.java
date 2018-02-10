package dev.sanket;

import java.util.Arrays;
import java.util.Comparator;

public class GridlandMetro {

    public static long findNoOfLampposts(long n, long m, long k, long[][] tracks) {

        Arrays.sort(tracks, new TrackComparator());

        long count = 0;

        for (int i = 0; i < k; i++) {

            int j = i + 1;
            
            while ((j < k) && (rowOf(tracks[i]) == rowOf(tracks[j]))
                    && (terminationPointOf(tracks[i]) >= startingPointOf(tracks[j]) - 1)) {
                
                mergeTracks(tracks, i, j);
                j++;
            }

            count = count + (tracks[i][2] - tracks[i][1] + 1);
            i = j - 1;
        }

        return (m * n) - count;
    }

    private static void mergeTracks(long[][] tracks, int i, int j) {
        tracks[i][2] = Math.max(terminationPointOf(tracks[i]), terminationPointOf(tracks[j]));
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
    
    private static final class TrackComparator implements Comparator<long[]> {

        @Override
        public int compare(long[] firstTrack, long[] secondTrack) {

            if (firstTrack[0] < secondTrack[0]) {
                return -1;
            }

            if (firstTrack[0] == secondTrack[0]) {
                return firstTrack[1] <= secondTrack[1] ? -1 : 1;
            }

            return 1;
        }
    }
}
