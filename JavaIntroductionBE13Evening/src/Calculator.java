

public class Calculator {
    public static void main(String[] args) {
        System.out.println(allAriphmeticOperator(2, 9, "*"));
    }

    public static int allAriphmeticOperator(int a, int b, String operator) {
        int temp = 0;
        if (operator.equals("*")) {
            for (int i = 0; i < b; i++) {
                temp = temp + a;
                System.out.println(a);
            }
        }
        return temp;
    }
}
