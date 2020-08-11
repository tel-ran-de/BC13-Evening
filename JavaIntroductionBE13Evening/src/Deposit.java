public class Deposit {
    public static void main(String[] args) {
        System.out.println(deposit(1000, 3.5, 7));
        System.out.println(deposit(1000, 10, 2));
    }

    public static double deposit(int money, double percent, int year) {
        //  return money + money * percent * year / 100;

        double temp = money;
        for (int i = 0; i < year; i++) {
            temp = temp + temp * percent / 100;
        }
        return temp;
    }
}
