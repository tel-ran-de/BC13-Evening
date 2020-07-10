
public class Logic01 {

    public static void main(String[] args) {
        //Родители Васи Сидорова купили умный сейф и запрограммировали его на выдачу денег по отпечатку пальцев одного из родителей.
        /*System.out.println(smartDepositBox(true, false));//true
        System.out.println(smartDepositBox(false, true));//true
        System.out.println(smartDepositBox(false, false));//false*/
     /*   System.out.println(smartDepositBox2(true, false));//false
        System.out.println(smartDepositBox2(false, true));//false
        System.out.println(smartDepositBox2(false, false)); //false
        System.out.println(smartDepositBox2(true, true)); // true*/
        /*System.out.println(bigBadaBoom(true, true)); //true
        System.out.println(bigBadaBoom(false, false));// false
        System.out.println(bigBadaBoom(true, false));//false*/
       /* System.out.println(verySmartDepositBox(true,true,true));// true
        System.out.println(verySmartDepositBox(false,false,false));//false
        System.out.println(verySmartDepositBox(false,true,false));// false
        System.out.println(verySmartDepositBox(false,false,true));// true
        System.out.println(verySmartDepositBox(true,true,false));// true*/

        System.out.println(doorbell(true, true)); // false
        System.out.println(doorbell(false, false)); // false
        System.out.println(doorbell(true, false)); // true
    }

    public static boolean smartDepositBox(boolean mamaPermission, boolean papaPermission) {
        return mamaPermission || papaPermission;
    }

    public static boolean smartDepositBox2(boolean mamaPermission, boolean papaPermission) {
        return mamaPermission && papaPermission;
    }

    public static boolean bigBadaBoom(boolean o1, boolean o2) {
        return o1 && o2;
    }

    public static boolean verySmartDepositBox(boolean mamaPermission, boolean papaPermission, boolean OmaPermission) {
        return OmaPermission || smartDepositBox2(mamaPermission, papaPermission);
    }

    public static boolean verySmartDepositBoxUno(boolean mamaPermission, boolean papaPermission, boolean OmaPermission) {
        return mamaPermission && papaPermission || OmaPermission;
    }

    public static boolean doorbell(boolean door, boolean gate) {
        return door ^ gate;
    }
}

