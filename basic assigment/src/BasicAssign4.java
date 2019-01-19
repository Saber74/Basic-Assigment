/*Basic Assignment #4
Nizar Alrifai
Finds the average class size where 2 people share a birthday
 */
import java.util.stream.IntStream;


import java.util.*;
public class BasicAssign4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int total=0; //checks the number of people required for a match and collect the values so they are ready to average
        int len=0; // for length of the Intarr array as it is preset to 365 indexes(number of unique days in a year)
        for (int i = 0; i <= 10000; i++) { //loop to run 10000 times in it are some constants in need of value reassigning after completion of the nested loop
//            System.out.println(counter);
//            counter=0;
            boolean contain=false; //checks for duplicates
            int intArr[] = new int[365]; //max number of unique days, will hold integers for comparison
            for(int counter=1;contain==false;counter++){
                int generatedNum = rand.nextInt(365) + 1; //creating a random number
                contain = IntStream.of(intArr).anyMatch(num->num==generatedNum); //checking for duplicates(gives a boolean value)
                intArr[counter]=generatedNum; //adds the random number to array if the loop was not broken
                len=counter;
            }
            total+=len;
        }
        System.out.println(total/10000);
    }
}



