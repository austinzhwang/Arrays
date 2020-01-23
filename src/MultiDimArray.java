public class MultiDimArray {

    public static void main (String []args) {

        String mdArray [] [] = new String [10] [5];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("row " + i + " col " + j + " ");
            }
            System.out.println();
        }

        System.out.println();

        String multTable [] [] = new String [12] [12];
        for (int i = 1;  i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
