package lessonLessThan30;

public class MyLovelyForEach {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        System.out.println("Первый вариант");
        for (int elementik : a1) {
            System.out.print(elementik + " ");
        }
        System.out.println();
        System.out.println("Второй вариант");
        for (int i = 0; i < a1.length; i = i + 2) {
            System.out.print(a1[i] + " ");
        }
    }
}
