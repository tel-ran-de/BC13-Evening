package lesson06;

public class Customer {
    public static void main(String[] args) {
        int customerValue = 999;
        myChoose(customerValue);
    }

    public static void myChoose(int value) {
        switch (value) {
            case 45:
                CoffeeVending.latte();
                break;
            case 46:
                CoffeeVending.americano();
                break;
            case 47:
                CoffeeVending.cappuccino();
                break;
            default:
                System.out.println("Пожалуйста измените выбор. "
                        + value + " временно недоступен");
                break;
        }
    }
}
