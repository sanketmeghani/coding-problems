package dev.sanket;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountingGameTest {

    @Test
    public void shouldReturnCorrectWinnerForBasicInput() {
        int n = 1;
        String winner = CounterGame.counterGame(n);
        assertEquals("Richard", winner);
    }
    
    @Test
    public void shouldReturnCorrectWinner() {
        int n = 6;
        String winner = CounterGame.counterGame(n);
        assertEquals("Richard", winner);
    }
}
