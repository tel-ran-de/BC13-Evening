public class Password {
    public static void main(String[] args) {
        System.out.println(genPass(20));
    }

    public static String genPass(int passLength) {
        String pass = "";
        for (int i = 0; i < passLength; i++) {
            pass = pass + genOneCharTwo();
        }
        return pass;
    }

    private static String genOneChar() {
        String input = "ABCDEFGDTZUWKLÖAPWJXSUIJKSLPÖ";
        char myChar;
        int result = (int) (Math.random() * ((input.length() - 1) + 1));
        myChar = input.charAt(result);
        return "" + myChar;
    }

    private static String genOneCharTwo() {
        int min = 65;
        int max = 90;
        int result = (int) (Math.random() * ((max - min) + 1)) + min;
        char myChar = (char) result;
        String output = "" + myChar;
        if ( Math.random() > 0.5) {
            output = output.toUpperCase();
        } else output = output.toLowerCase();
        return output;
    }
}
