public class FloydsTriangle {
    public static void main(String[] args) {
         trianglesOfNumbers();
    }
    private static void trianglesOfNumbers() {
        int founding = 7;
        int n = 1;
        for (int i = 1; i < founding; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(n + " ");
                n++;
                if (n == founding) {
                    break;
                }
            }
            System.out.println("");
        }
    }
}
