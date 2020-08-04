public class MyBooleanArrayInit {
    public static void main(String[] args) {
        boolean[] b = new boolean[10];
        myPrintBooleanArray(b);
        myPrintBooleanArray(fillMyBooleanArray(b));
    }

    public static boolean[] fillMyBooleanArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() >= 0.5;
        }

        return array;
    }

    public static void myPrintBooleanArray(boolean[] b) {
        System.out.println("Логический массив, длиной + " + b.length);
/*        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }*/

        for (boolean value : b) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
