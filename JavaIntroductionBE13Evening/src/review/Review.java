package review;

public class Review {
    public static void main(String[] args) {
        //integerReview();
        //doubleReview();
        //stringReview();
    }

    public static void booleanReview() {
        // true false
        // Конъюнкция, дизъюнкция, антиваленц, отрицание
        // &,|,^, !  // пайплайн, циркумфлекс
        // # решётка, диез, хэштэг, route,
        boolean vasilij = false;
        boolean maria = true;
        boolean result;  // равен единице
    }


    public static void stringReview() {
        System.out.println("Hello World");
        String variableOne = "Привет Мир Привет Мир Привет Мир Привет Мир Привет Мир ";
        variableOne = variableOne.toUpperCase();
        System.out.println(variableOne);
        String myNeString = variableOne.substring(0, 5);
        System.out.println(myNeString.toLowerCase());
        int stringLength = variableOne.length();
        System.out.println(stringLength);
    }

    public static void doubleReview() {
        double d = Math.PI;
        float f = 32453.45F;
        System.out.println(4.0 / 7.5);
    }

    public static void integerReview() {
        byte b = 100;
        short var1 = 234;
        short var2 = 4334;
        short s = (short) (var1 + var2);
        int i = 23423;
        long l = 756438292764L;

        int money = 10;
        int arbuz = 100;
        int result = money / arbuz;
        System.out.println(result);
    }
}
