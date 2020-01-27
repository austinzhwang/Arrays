public class Locker {

    public static void main (String []args) {

        //Creates 101 locker boolean elements; ignore locker at index 0 and start with locker 1
        boolean [] locker = new boolean [101];

        //Set every locker to open
        for (int i = 1; i < locker.length; i++) {
            locker[i] = true;
        }

        //Starting with locker 2 and every other 2nd locker; close the locker if open and open the locker if closed
        //Continue process with locker 3 and every nth locker after that
        for (int i = 2; i < locker.length; i++) {
            for (int j = i; j <locker.length; j++) {
                if (j % i == 0) {
                    locker[j] = !locker[j];
                }
            }
        }
        //Output the open lockers
        System.out.println("Open Lockers");
        for (int i = 1; i < locker.length; i++) {
            if (locker[i]) {
                System.out.print(i + " ");
            }
        }


    }
}
