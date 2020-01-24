public class Locker {

    public static void main (String []args) {

        boolean [] locker = new boolean [101];

        //Set every locker to open
        for (int i = 1; i < locker.length; i++) {
            locker[i] = true;
        }
        //Starting with locker 2 and every 2 lockers after 2, set the locker to closed
        for (int i = 2; i < locker.length; i+=2) {
            locker[i] = false;
        }
        //Starting with locker 3 and every other 3rd locker; close the locker if open and open the locker if closed
        for (int i = 3; i < locker.length; i++) {
            for (int j = 1; j <locker.length; j++) {
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
