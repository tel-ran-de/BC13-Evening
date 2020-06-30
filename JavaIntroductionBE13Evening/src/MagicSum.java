public class MagicSum {
    public static void main(String[] args) {
        additionOne();
        additionTwo(5, 6);
        int firstVariable = 10;
        int secondVariable = 20;
        int thirdVariable = additionThree(firstVariable, secondVariable);
        System.out.println("Сумма из третьего метода = " + thirdVariable);
        System.out.println("Сумма из четвёртого метода = " + additionFor(firstVariable, 465));
    }

    public static void additionOne() {
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println("Сумма из первого метода = " + c);
    }

    public static void additionTwo(int a, int b) {
        int c = a + b;
        System.out.println("Сумма из второго метода = " + c);
    }

    public static int additionThree(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int additionFor(int a, int b) {
        return a + b;
    }

}
