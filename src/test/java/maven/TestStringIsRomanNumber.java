package maven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by User on 30.11.2015.
 */
public class TestStringIsRomanNumber {

    Tools tools = new Tools();

    @Test
    public void positiveTest() {
        assertTrue(true == tools.stringIsRomanNumber("IiVvXxLlCcDdMm"));
    }

    @Test
    public void negativeTest1() {
        assertTrue(false == tools.stringIsRomanNumber(""));
    }

    @Test
    public void negativeTest2() {
        assertTrue(false == tools.stringIsRomanNumber("A"));
    }
}