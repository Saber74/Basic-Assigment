/*Basic Assignment #1
Nizar Alrifai
Gets a string from the user and outputs a hollow square
 */
import java.util.*;
class BasicAssign1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = stdin.next();
        int n = word.length();
        int x=n-1;
        String space=String.format("%"+x+"s","");
        System.out.println(word+word.charAt(0)); //prints the first line of the block
        int var=1;
        String reverseWord=new StringBuilder(word).reverse().toString(); //reverses the word for the last line
        for(int i=0;i<x;i++){ //is responsible for printing the sides of the box with the spaces discluding the anything on the first and last line
            System.out.println(word.charAt(n-i-1)+space+word.charAt(var));
            if(x>var) var++;
            else System.out.println(word.charAt(0)+reverseWord); //prints the last line if there is nothing more to add before it


        }


    }
}



