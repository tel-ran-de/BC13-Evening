public class HW22 {
    public static void main(String[] args) {
        String message = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
        String benchmark = "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.";
        System.out.println(enigmaCaesar(message).toLowerCase());
        System.out.println(enigmaCaesar(message).equalsIgnoreCase(benchmark));
    }

    public static String enigmaCaesar(String input) {
        input = input.toUpperCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + getMeCaesarChar(input.charAt(i));
        }
        return output;
    }

    private static String getMeCaesarChar(char myInputChar) {
        String caesarSymbol = "";
        String inputSource = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ .,";
        String outputSource = "ГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯАБВ .,";
        //Исходный алфавит: А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я
        //Шифрованный:      Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я А Б В

        for (int i = 0; i < inputSource.length(); i++) {
            if (inputSource.charAt(i) == myInputChar) {
                caesarSymbol = String.valueOf(outputSource.charAt(i));
            }
        }
        //System.out.println(caesarSymbol);
        return caesarSymbol;
    }
}
