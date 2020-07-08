/**
 * JavaIntroductionBE13Evening
 * 08 20 : 12
 */
public class Work0902 {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(195));
    }

    public static boolean nearHundred(int x) {
        int range = 10;
        return Math.abs(x - 100) <= range || Math.abs(x - 200) <= range;
    }
}
