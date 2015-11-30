package maven;

import java.util.Scanner;

/**
 * Created by User on 30.11.2015.
 */
public class RomanToArabic {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String romanNumber;
        System.out.print("Enter ROMAN number: ");
        romanNumber = userInput.next();
        int arabicNumber;
        if (Tools.stringIsRomanNumber(romanNumber)) {
            arabicNumber = Tools.convertRomanNumberToArabic(romanNumber);
            System.out.println("ARABIC decimal equivalent of " + romanNumber + " is " + arabicNumber);
        } else {
            System.out.println(romanNumber + " is not ROMAN number");
        }
    }
}