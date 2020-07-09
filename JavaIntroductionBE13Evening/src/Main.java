public class Main {

    public static void main(String[] args) {
        String input = "ANDREJ";
        String output = input.substring(0,3);
        System.out.println(output);
        System.out.println(input.substring(2,5));
        System.out.println(input.substring(3));
        System.out.println(input.substring(3,4));
        int dlina = input.length();
        System.out.println(dlina);
        System.out.println(input.charAt(4));
        int lastIndex = input.length()-1;
        char c1 = input.charAt(lastIndex);
        String s1 = String.valueOf(input.charAt(lastIndex));
        String s2 = input.substring(lastIndex);
    }
}

