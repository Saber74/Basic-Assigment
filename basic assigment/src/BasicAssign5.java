/*Basic Assignment #5
Nizar Alrifai
Given a product code, the program checks if the code is valid or not.
 */

import java.util.*;
public class BasicAssign5 {
    public static void main(String[] args) {
        boolean valid = true; //checks if code is valid
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter product code: ");
        String code=stdin.nextLine();
        String[] splitCode=code.split("(\\s)+");
        if (splitCode.length==2) {
            String word = splitCode[0];
            int value = Integer.parseInt(splitCode[1]);
            String numString = ""; //bigger so it does not crash if code is invalid due to the amount of number
            int numberCounter = 0; //counts how many numbers are in the product code
            int len = word.length();
            for (int i = 0; i < len; i++) {
                if (Character.isLetter(word.charAt(i))) {
                    if (Character.isLowerCase(word.charAt(i))) valid = false;
                } else if (Character.isDigit(word.charAt(i))) {
                    numberCounter += 1;
                    numString += word.charAt(i);

                }
            }
            if (numberCounter != 6) valid = false; //checking for the number of digits in the code
            else {
                int x = Character.getNumericValue(numString.charAt(0)) * 10 + Character.getNumericValue(numString.charAt(1));
                int y = Character.getNumericValue(numString.charAt(2)) * 10 + Character.getNumericValue(numString.charAt(3));
                int z = Character.getNumericValue(numString.charAt(4)) * 10 + Character.getNumericValue(numString.charAt(5));
                int multipleValue = x * y * z;
                if (multipleValue != value) valid = false;
            }
        }
        else valid=false;
        if (valid == false) System.out.println("Invalid code");
        else System.out.println("Valid Code");
    }
}