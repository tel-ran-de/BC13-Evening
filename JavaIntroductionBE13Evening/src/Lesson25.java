public class Lesson25 {
    public static void main(String[] args) {
       /* System.out.println(blueTicket(9, 1, 0));// →10
        System.out.println(blueTicket(9, 2, 0));// →0
        System.out.println(blueTicket(6, 1, 4));//→10

        System.out.println(dateFashion(5, 10));// → 2
        System.out.println(dateFashion(5, 2)); //→ 0
        System.out.println(dateFashion(5, 5));//→1*/

        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));//→ 20
        System.out.println(sortaSum(10, 11));// → 21
    }

    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) {
            return 10;
        } else if ((a == 10 + c) || (b == 10 + c)) {
            return 5;
        } else return 0;
    }

    public static int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        } else return 1;
    }

    public static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        }
        return a + b;
    }
}
