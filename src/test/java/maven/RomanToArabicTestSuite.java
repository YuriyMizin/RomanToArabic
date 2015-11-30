package maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by User on 30.11.2015.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestStringIsRomanNumber.class,
        TestConvertRomanNumberToArabic.class,
        TestRomanDigitToArabic.class
})
public class RomanToArabicTestSuite {
}