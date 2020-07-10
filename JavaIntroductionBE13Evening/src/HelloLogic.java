
public class HelloLogic {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true)); //→ true
        System.out.println(monkeyTrouble(false, false)); //→ true
        System.out.println(monkeyTrouble(true, false)); // → false
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

}
