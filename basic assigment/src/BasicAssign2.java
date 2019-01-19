/*Basic Assignment #2
Nizar Alrifai
Given a string from the user it replaces every instance of multiple blanks with a single black
 */

import java.util.*;
class BasicAssign2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = stdin.nextLine();
        String arr [] = word.split("(\\s)+");
        String joinedSent=String.join(" ", arr);
        System.out.println(joinedSent);

        }
    }
