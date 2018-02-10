package dev.sanket;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GridlandMetroTest {

    private long noOfRows;
    
    private long noOfColumns;
    
    private int noOfTracks;
    
    private long[][] tracks;
    
    @Parameter(value = 0)
    public String inputFileName;

    @Parameter(value = 1)
    public int noOfLampposts;
    
    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] { { "/input1.txt", 9 } });
    }
    
    private void readInputs(String fileName) {

        try (Scanner in = new Scanner(GridlandMetroTest.class.getResourceAsStream(fileName))) {

            noOfRows = in.nextLong();
            noOfColumns = in.nextLong();
            noOfTracks = in.nextInt();
            
            tracks = new long[noOfTracks][3];
            
            for (int i = 0; i < noOfTracks; i++) {
                for (int j = 0; j < 3; j++) {
                    tracks[i][j] = in.nextLong();
                }
            }
        }
    }
    
    @Test
    public void shouldReturnNoOfCells() {
        readInputs(inputFileName);
        
        long result = GridlandMetro.findNoOfLampposts(noOfRows, noOfColumns, noOfTracks, tracks);

        assertEquals("Invalid not of lampposts", noOfLampposts, result);
    }
}
