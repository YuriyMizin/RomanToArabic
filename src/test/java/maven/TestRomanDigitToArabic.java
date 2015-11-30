package maven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by User on 30.11.2015.
 */
public class TestRomanDigitToArabic {
    Tools tools = new Tools();

    @Test
    public void negativeTest1() {
        assertTrue(-1 == tools.romanDigitToArabic('A'));
    }

    @Test
    public void positiveTest1() {
        assertTrue(1 == tools.romanDigitToArabic('i'));
    }

    @Test
    public void positiveTest2() {
        assertTrue(1000 == tools.romanDigitToArabic('M'));
    }
}