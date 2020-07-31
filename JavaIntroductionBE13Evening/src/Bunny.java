public class Bunny {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(100)); // 250
/*        System.out.println(bunnyEars2(0));// → 0
        System.out.println(bunnyEars2(1));// → 2
        System.out.println(bunnyEars2(2)); //→ 5*/
    }

    public static int bunnyEars2(int rabbit) {
        if (rabbit == 0) {
            return 0;
        }
        if (rabbit % 2 == 1) { // проверка нечётности
            return 2 + bunnyEars2(rabbit - 1);
        } else {
            return 3 + bunnyEars2(rabbit - 1);
        }
    }

    public static int bunnyEars2ForLoop(int rabbit) {
        int result = 0;
        for (int i = 0; i < rabbit; i++) {
            if (rabbit == 0) {
                result += 0;
            }
            if (rabbit % 2 == 1) { // проверка нечётности
                result += 2;
            } else {
                result += 3;
            }
        }
        return result;
    }


    private static int bunnyEars2Simple(int rabbit) {
        return rabbit * 2 + rabbit / 2;
    }
}
