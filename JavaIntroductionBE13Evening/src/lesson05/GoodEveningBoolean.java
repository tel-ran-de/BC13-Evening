package lesson05;

public class GoodEveningBoolean {
    public static void main(String[] args) {
        //myLovelyBoolean();
        //booleanOpers();
        // booleanIntroduction();
        anotherBoolean();
    }

    public static void myLovelyBoolean() {
        // true , false
        int a = 1, b = 2;
        boolean bool0 = (a <= b);
        System.out.println(bool0);
        boolean bool1 = 25 > 56;
        System.out.println(bool1);
    }

    public static void booleanOpers() {
        boolean родитель1 = true;
        boolean родитель2 = true;
        boolean мороженко = родитель1 | родитель2;


        //Дизъюнкция  |
        // 1.Деньги от папы, но не от мамы
        // 2.деньги от папы и от мамы
        // 3.деньги НЕ от папы , но от мамы
        // 4.деньги не от папы, и не от мамы
        // Логическое или, OR, ODER
        split();
        boolean papa = true, mama = false;
        boolean money = papa | mama;
        System.out.println("Дизъюнкция " + money);
        split();

        // Конъюнкция
        // И, AND, UND, &
        // 1. Оба не повернули
        // 2. Оба повернули
        // 3. Два варианта один повернул , а один нет.

        boolean of1 = true;
        boolean of2 = false;
        boolean bababoom = of1 & of2;
        System.out.println("Конъюнкции " + bababoom);
        split();
        // Антиваленц, XOR, EOR, EXOR,  ^
        boolean village = true;
        boolean alps = true;
        boolean vacation = village ^ alps;
        System.out.println("Антиваленц " + vacation);

        // &, &&    |, ||

    }

    public static void split() {
        System.out.println("--------------------");
    }

    public static void booleanIntroduction() {
        boolean a, b, c;
        a = true;
        b = false;
        c = a & b;
        System.out.println(c); // returns false because only one of the two required values is true
        int d = 1, f = 2;
        boolean bool = d <= f;
        int i = 10;
        int j = 9;
        System.out.println(i > j); // returns true, because 10 is higher than 9
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15
        int x = 10;
        System.out.println(x == 10); // returns true, because the value of x is equal to 10
    }

    public static void anotherBoolean() {

        boolean a = 75 > 7 + 8 * 5;  // труе

        boolean b = (7 + 8) * 4 != 7 + 4 * 5;  // труе

        boolean c = false & false;  // false

        //  c = 7 > 10 & 11 > 12  //

        boolean e = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;
        boolean f = !(3 * 4 < 7 + 8);

        System.out.println(a + "\n" + b + "\n" + c + "\n" + e + "\n" + f);
    }
}
