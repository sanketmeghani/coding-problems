package dev.sanket.coding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordsReverserTest {

    @Test
    public void shouldReverSingleWord() {

        String input = "Hello!";

        WordsReverser wordsReverser = new WordsReverser(input);
        String reversed = wordsReverser.reverse();

        assertEquals("Words not reversed properly", "!olleH", reversed);
    }
    
    @Test
    public void shouldReversAllWords() {
        
        String input = "This is magic!";
        
        WordsReverser wordsReverser = new WordsReverser(input);
        String reversed = wordsReverser.reverse();

        assertEquals("Words not reversed properly", "sihT si !cigam", reversed);
    }
}
