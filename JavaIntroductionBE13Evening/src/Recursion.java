public class Recursion {
    public static void main(String[] args) {
        //System.out.println(findFact(10)); //720
        // System.out.println(factRecursion(6));
        // findFibonaci(27);
        System.out.println(findFibonacciRecursion(25));
    }

    private static int findFibonacciRecursion(int digit) {
        if (digit == 0) {
            return 0;
        } else if (digit == 1) {
            return 1;
        } else {
            return findFibonacciRecursion(digit - 1) + findFibonacciRecursion(digit - 2);
        }
    }

    private static void findFibonaci(int number) {
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i < number; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }


    public static int factRecursion(int digit) {
        System.out.println(digit);
        if (digit > 1) {
            return digit * factRecursion(digit - 1);
        } else return 1;
    }

    private static int findFact(int digit) {
        int result = 1;
        for (int i = 1; i <= digit; i++) {
            result *= i;
        }
        return result;
    }
}