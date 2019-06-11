package quotes.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void testQuote(){

        Quote test = new Quote("Random text", "random author" );
        assertEquals("Quote author should be the same.", "random author", test);
        assertEquals("Quote text should be the same.", "Random text", test);
    }


}