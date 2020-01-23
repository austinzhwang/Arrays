import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {

    public static void main (String []args) {
        System.out.println(reverseString("Hello"));
        System.out.println(stringLength("Java"));

        Scanner in = new Scanner(System.in);
        int tenNums [] = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int numInput = in.nextInt();
            tenNums[i] = numInput;
        }



    }

    //Method that will print out a string in reverse;
    public static String reverseString (String s) {
        String reversed = "";
        for (int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    //Method to find length of a string without using the the library function
    public static int stringLength (String s) {
        int count = 0;
        char [] strToCharArray = s.toCharArray();

        for(char c : strToCharArray) {
            count++;
        }
        return count;
    }

    //Method to remove duplicate values in an array

}
