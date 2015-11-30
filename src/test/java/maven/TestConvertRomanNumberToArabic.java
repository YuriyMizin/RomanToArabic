package maven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by User on 30.11.2015.
 */
public class TestConvertRomanNumberToArabic {

    Tools tools = new Tools();

    @Test
    public void positiveTest1() {
        assertTrue(1 == tools.convertRomanNumberToArabic("i"));
    }

    @Test
    public void positiveTest2() {
        assertTrue(15 == tools.convertRomanNumberToArabic("XV"));
    }

    @Test
    public void positiveTest3() {
        assertTrue(1400 == tools.convertRomanNumberToArabic("McD"));
    }
}
