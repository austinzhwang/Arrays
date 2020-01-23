import java.util.Scanner;

public class ArraysPractice {

    public static void main (String []args) {

        Scanner in = new Scanner(System.in);
        //Array holds #'s 1-10
        int [] intHolder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Sum of #'s 1-10 = 55
        int sum = 0;
        for (int i = 0; i < intHolder.length; i++) {
            sum += intHolder[i];
        }
        System.out.println("Sum of #'s 1-10 is: " + sum);

        //Take user input for 10 #'s and sum input
        int sumInput = 0;
        int [] inputSumArray = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int numInput = in.nextInt();
            inputSumArray[i] = numInput;
        }

        for(int i = 0; i < inputSumArray.length; i++) {
            sumInput += inputSumArray[i];
        }
        System.out.println("Sum of the inputted values is: " + sumInput);

        //String array that stores 3 names and outputs them with a  for loop
        String namesArray [] = new String [3];
        namesArray[0] = "Name A";
        namesArray[1] = "Name B";
        namesArray[2] = "Name C";

        String names = "";
        for (int i = 0; i < namesArray.length; i++) {
            System.out.println("Name at index " + i + " is: " + namesArray[i]);
        }

        //Loop through array and print out index each time value is 5
        int [] fiveArray = {2, 5, 9, 0, 2, 1, 8, 5, 4};
        for (int i = 0; i < fiveArray.length; i++) {
            if (fiveArray[i] == 5) {
                System.out.println("Index " + i + " contains the value 5");
            }
        }

        //Array with #'s 1-10 printed backwards
        int [] backwardsArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("The array backwards is: ");
        for (int i = backwardsArray.length; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Loops through array to find "t" in the string array and replace it with "hello"
        String [] replaceArray = {"w","t","y","h","k"};

        for (int i = 0; i < replaceArray.length; i++) {
            if (replaceArray[i].equals("t")) {
                replaceArray[i] = "hello";
            }
        }

        for (String s : replaceArray) {
            System.out.print(s);
        }
        System.out.println();

        //Prints out matching pairs from two arrays
        int [] arrayOne = {1, 7, 6, 5, 9};
        int [] arrayTwo = {2, 7, 6, 3, 4};

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                System.out.println("(" + arrayOne[i] + "," + arrayTwo[i] + ")");
            }
        }

    }
}
