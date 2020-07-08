package testReview;

/*
char	charAt(int index)
Returns the char value at the specified index.
int	codePointAt(int index)
Returns the character (Unicode code point) at the specified index.
 */
public class Main {
    public static void main(String[] args) {
        String myLovelyString = "День экзамена уже близок";
        int dlina = myLovelyString.length();
        //System.out.println(dlina);
        myLovelyString = myLovelyString.substring(0, 20);
        //System.out.println(myLovelyString);
        String знакРазделения = "\t";
        String firstName = "Василий";

        String birthDate = "25.10.1964" + знакРазделения;

        String lastName = "Васечкин" + знакРазделения;
        char c = lastName.charAt(4);
        //System.out.println(c);




        int ничегоНепонимаю = lastName.codePointAt(4);
        System.out.println(ничегоНепонимаю);
        char test = 1095;
        System.out.println(test);
    }









    public static void myReviewMethode() {
        int myLovelyDigit = 100;
        String myLovelyString = "День экзамена уже близок!";
        System.out.println("Тестовое сообщение "
                + myLovelyString + " \n"
                + myLovelyDigit);
        String mashaAge = "35";
        String sashaAge = "25";
        String dashaAge = "45";
        String mishaAge = "30";
        int dasha = Integer.parseInt(dashaAge);
        System.out.println(dasha);
        int data = 10_2007;
        String dataForEmail = String.valueOf(data);
        System.out.println(dataForEmail);
        int myTest = Integer.parseInt(myLovelyString);
        System.out.println(myTest);
    }
}
