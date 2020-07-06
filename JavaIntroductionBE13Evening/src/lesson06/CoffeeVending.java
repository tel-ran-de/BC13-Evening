package lesson06;

public class CoffeeVending {

    public static void americano() {
        System.out.println("------------");
        System.out.println("Ваш американо подан");
        milk(0);
        coffee(40);
        water(10);
        System.out.println("------------");

    }

    public static void cappuccino() {
        System.out.println("------------");
        System.out.println("Ваш капучино подан");
        milk(30);
        coffee(40);
        water(20);
        System.out.println("------------");
    }

    public static void latte() {
        System.out.println("------------");
        System.out.println("Ваш лате подан");
        milk(40);
        coffee(30);
        water(70);
        System.out.println("------------");
    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    public static void coffee(int ml) {
        System.out.printf("Added %d ml of coffee \n", ml);
    }
}
