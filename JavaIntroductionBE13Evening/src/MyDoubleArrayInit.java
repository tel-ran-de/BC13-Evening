public class MyDoubleArrayInit {
    public static void main(String[] args) {
        int dlina = (int) (Math.random() * 20) + 1;
        double[] d1 = new double[dlina];
        myDoubleArrayPrint(d1);
        double[] d2 = fillMyDoubleArray(d1);
        myDoubleArrayPrint(d2);
    }

    public static double myRound(double d) {
        int temp = (int) (d * 1000);
        return (double) temp / 1000;
    }

    public static double[] fillMyDoubleArray(double[] d) {
        for (int i = 0; i < d.length; i++) {
            d[i] = myRound(Math.random());
        }
        return d;
    }

    private static void myDoubleArrayPrint(double[] array) {
        System.out.println("Дробный массив, длиной - " + array.length);
        System.out.println("И его значения:");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println();
    }
}
