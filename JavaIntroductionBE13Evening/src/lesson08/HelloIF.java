package lesson08;

public class HelloIF {
    public static void main(String[] args) {
        helloIfElse();
        int customer1 = 15;
        int customer2 = 17;
        int customer3 = 19;
        int customer4 = 30;
        alcoholPermission(customer1);
        alcoholPermission(customer2);
        alcoholPermission(customer3);
        alcoholPermission(customer4);
    }

    public static void alcoholPermission(int customerAge) {
        // если возраст покупателя строго меньше 16 не включая, то алкоголь не продавать
        // если возраст покупателя больше или равен 16 и меньше 18, то можно продавать пиво
        // если возраст больше или равен 18, то можно продавать всё
        // (customerAge >= 16 & customerAge < 18)  избытычно
        if (customerAge < 16) {
            System.out.println("алкоголь не продавать");
        } else if (customerAge < 18) {
            System.out.println("можно продавать пиво");
        } else {
            System.out.println("можно продавать всё");
        }
    }


    public static void helloIfElse() {
        boolean permission = false;

        if (permission) {
            System.out.println("Я могу поехать в пионерский лагерь");
        } else {
            System.out.println("Я на всё лето останусь дома");
        }
    }
}
