package lesson08;

public class Baikonur {
    public static void main(String[] args) {
        double speedOne = 7.0;
        double speedTwo = 15.3;
        double speedThree = 15.3;

        spaceShuttle(speedOne);
        System.out.println("-------------");
        spaceShuttle(speedTwo);
        System.out.println("-------------");
        spaceShuttle(speedThree);
    }

    public static void spaceShuttle(double speed) {
        final double SUPERCONSTANT_G = 10.0;
        // модификатор final обозначает константность переменной, которую невозможно изменить.
        // например, ускорение свободного падения на поверхности Земли или
        // PI, которое всегда константо. Кроме этой особенности final на результаты вычисления
        // не влияет

        // если скорость корабля меньше G, то не полетит, иначе полетит

        if (speed < SUPERCONSTANT_G) {
            System.out.println("Первоначальное ускорение недостаточно");
            System.out.println("Ракета не может стартовать");
            System.out.println("Подготовить аварийные службы");
        } else {
            System.out.println("Ракета улетает в космос");
            System.out.println("Выпустить пресс-релиз об успешном запуске");
            System.out.println("Подготовить программистов к государственным наградам");
        }
    }
}
