public class HelloTwelve {
    public static void main(String[] args) {
        repeat(5);
    }

    public static void repeat(int weekDays) {
        for (int i = 1; i <= weekDays; i++) {
            System.out.println("-------------новый день----------------  " + i);
            System.out.println("Встаю в шесть утра");
            System.out.println("Иду на завод к восьми");
            System.out.println("В 17:30 я уже дома");
            System.out.println("Я смотрю кино по Netflix");
            System.out.println("Курю с соседом");
            System.out.println("Иду спать");
            System.out.println("----------День подошёл к концу-----------");
        }

        for (int i = weekDays; i > 0; i--) {

        }
    }
}
