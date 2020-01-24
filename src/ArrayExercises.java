import java.util.LinkedHashSet;
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

        int [] a = {1,7,6,5,9};
        int [] b = {2,7,6,3,4};
        findPairs(a, b, 13);

        System.out.println(totalOddAndEven(tenNums));

        removeDuplicates(tenNums);

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
    public static void removeDuplicates(int [] a) {
        LinkedHashSet<Integer> removedDupes = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            removedDupes.add(a[i]);
        }
        System.out.println("Remaining values after removing the duplicates: " + removedDupes);
    }

    //Method to print out pairs in two arrays that equal to a sum
    public static void findPairs (int [] a, int [] b, int sum) {
        System.out.println("Pairs in the array that equal the sum " + sum);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == sum) {
                    System.out.println("(" + a[i] + "," + b[j] + ")");
                }
            }
        }
    }

    //Method to print out total number of even numbers and odd numbers
    //in a array with values entered by the user
    public static String totalOddAndEven(int [] ary) {
        int oddCount = 0, evenCount = 0;

        for (int i = 0; i < ary.length; i++) {
            if (ary[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return "Total Odd: " + oddCount + "\n"
                + "Total Even: " + evenCount;
    }

}
