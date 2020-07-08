/**
 * JavaIntroductionBE13Evening
 * 08 19 : 53
 */
public class Work09 {
    public static void main(String[] args) {
/*        int a = 15;
        int b = 5;
        System.out.println(findTrue(a, b));*/

        int mont = 8;
        System.out.println(getStringMonth(mont));
    }

    public static boolean findTrue(int firstVariable, int secondVariable) {
        return firstVariable > 10 && firstVariable < 20 || secondVariable > 10 && secondVariable < 20;
        //        if (firstVariable > 10 && firstVariable < 20 || secondVariable > 10 && secondVariable < 20) {
        //            return true;
        //        }
        //        return false;
    }

    public static String getStringMonth(int month) {
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;

            default:
                monthString = "Invalid month ";
                break;
        }
        return monthString;
    }
}
