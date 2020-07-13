package review;

public class HelloCoffee {
    public static void main(String[] args) {
        //espresso();
        americano();
    }

    public static void espresso() {
        water();
        coffee();
    }

    public static void americano() {
        espresso();
        water();
    }


    public static void water() {
        System.out.println("Наливаем воду - 100 грамм");
    }

    public static void coffee() {
        System.out.println("Насыпаем кофе - одну дозу");
    }
}
