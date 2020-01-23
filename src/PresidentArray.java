import java.util.Scanner;

public class PresidentArray {

    public static void main (String []args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the names of the last 10 presidents in the order they were elected. " +
                "\nWhen you are done enter the word history to display their names starting with the most recent");
        System.out.println("=========================================================================================");

        String presNames [] = new String [10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a name: ");
            String name = in.nextLine();
            presNames[i] = name;
        }
        System.out.print("Enter history: ");
        String history = in.nextLine();
        String mostRecent = "";
        if (history.equalsIgnoreCase("history")) {
            for (int i = presNames.length-1; i >= 0; i--) {
                mostRecent += presNames[i] + " ";
            }
        }
        System.out.print(mostRecent);


    }

}
