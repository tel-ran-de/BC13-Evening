package review;

public class MyLovelySubstring {
    public static void main(String[] args) {
        String bavaria = "Мюнхен один из самых красивых городов Германии";
        String myNeString = bavaria.substring(4, 14);
        System.out.println(myNeString);

        String result = bavaria.substring(0, 4) + bavaria.substring(15);
        System.out.println(result);
    }
}
