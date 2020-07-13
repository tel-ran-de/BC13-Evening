package review;

public class SpaseShuttle {
    public static void main(String[] args) {
        spaceShuttleStart();
    }

    public static void spaceShuttleStart() {
        // добро из Москвы
        // добро из ггмц
        // добро от механиков
        // добро от врачей
        boolean разрешениеОтВрачей = doctorCheck();

        if (разрешениеОтВрачей) {
            start();
        }
    }

    public static boolean doctorCheck() {
        // очень много кода.
        return true;
    }
    public static void start(){
        System.out.println("полетели");
    }
}
