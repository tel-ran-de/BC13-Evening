package review;

public class LovelyPrimitives {
    public static void main(String[] args) {
        System.out.println(createUser());

/*        String newLine = "" + '\n' + '\t';
        int newLineLength = newLine.length();
        //System.out.println(newLineLength);

        for (int i = 0; i < newLineLength; i++) {
            System.out.println(newLine.charAt(i));
        }*/
    }

    private static String createUser() {
        String result;
        result = "";
        String username = "Василий";
        String secondName = "Сидоров";
        int age = 45;
        int height = 180;
        String newLine = "\n\t";
        int newLineLength = newLine.length();
        System.out.println(newLineLength);
        result = username + newLine + secondName + newLine + age + newLine + height + newLine;
        result = result + result;
        int dlinaStroki = result.length();
        System.out.println(dlinaStroki);
        return result;
    }
}
