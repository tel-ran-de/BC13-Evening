public class Fibonacci {
    static int count = 0;

    public static void main(String[] args) {
        fibonacci(10);
        System.out.println();
        System.out.println(findFiboRec(10));
    }

    private static int findFiboRec(int number) {
        count++;
        System.out.println("Считаем круги " + count);
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return findFiboRec(number - 1) + findFiboRec(number - 2);
        }
    }

    private static void fibonacci(int number) {
        int n0 = 1;
        int n1 = 1;
        int nN;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= number; i++) {
            nN = n0 + n1;
            System.out.print(nN + " ");
            n0 = n1;
            n1 = nN;
        }
    }
}
