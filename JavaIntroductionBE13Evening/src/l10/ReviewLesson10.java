package l10;

/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they
are both smiling or if neither of them is smiling. Return true if we are in trouble.
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */
public class ReviewLesson10 {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));  // → true
        System.out.println(monkeyTrouble(false, false));  // → true
        System.out.println(monkeyTrouble(true, false));  // → false
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    // конъюнкция  - &&
    // дизъюнкция  - ||
    // антиваленц  -  ^
    // отрицание   - !
        boolean wife = false;
        boolean ehegatten = !wife;

        System.out.println(ehegatten);

        return false;
    }

}
