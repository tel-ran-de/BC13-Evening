public class PrintDivisors {
    public static void main(String[] args) {
        printDivisors(15);
    }

    private static void printDivisors(int digit) {
        int count = 0;
        for (int i = digit; i > 0; i--) {
            if (digit % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total divisors: " + count);
    }
}
