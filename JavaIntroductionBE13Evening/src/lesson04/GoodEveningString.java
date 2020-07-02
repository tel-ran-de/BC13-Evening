package lesson04;

public class GoodEveningString {

    public static void main(String[] args) {
        //hallyHalloString();
        //magicCasting();
        helloString();
    }

    public static void magicCasting() {
        String number = "10";
        int result = Integer.parseInt(number);
        System.out.println(result);

        result = result + 1;
        System.out.println(result);
        result = result + 1;
        System.out.println(result);
        result++;
        System.out.println(result);
        result = +2;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result *= 2;
        System.out.println(result);
    }

    public static void hallyHalloString() {
        String firstName = "Василий";
        String lastName = "Сидоров";
        String newTelranStudent1 = firstName + " " + lastName;
        int dlina = newTelranStudent1.length();
        System.out.println(dlina);
    }


    public static void helloString() {
        String firstName = "Василий";
        String lastName = "Сидоров";
        char copyright = '©';
        int age = 25;
        char c5 = ' ';
        String space = "                                              ";
        System.out.println(firstName + " " + lastName + " " + age);
        String newTelranStudent1 = firstName + space + lastName + " " + copyright + " " + age;
        System.out.println("newTelranStudent1 - " + newTelranStudent1);

        char test = firstName.charAt(0);
        System.out.println("test - " + test);
    }
}
