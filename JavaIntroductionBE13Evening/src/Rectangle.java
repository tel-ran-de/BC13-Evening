public class Rectangle {
    public static void main(String[] args) {
        //rectangle(5, 7);
        // floydsTriangle(15);
        //triangle(7);
        threeUnknowns();
    }

    private static void threeUnknowns() {
        int rowIndex = 1;
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(rowIndex + ") "
                                + "x = " + x
                                + ", y = " + y
                                + ", z = " + z);
                        rowIndex++;
                    }
                }
            }
        }
    }


    public static void triangle(int n) {
        String star = "*";
        String line = "";
        for (int i = 0; i < n; i++) {
            line = line + star;
            System.out.println(line);
        }
    }

    private static void floydsTriangle(int n) {
        int digit = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(digit + " ");
                digit++;
            }
            System.out.println();
        }
    }

    private static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}