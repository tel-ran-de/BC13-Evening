package newTheme;

public class MyLovelyReturn {
    public static void main(String[] args) {
        quarantine(false);
    }

    private static void quarantine(boolean permission) {
        quarantineZone:
        {
            if (permission) {
                System.out.println("Выход из программы");
                return; // выход из программ
            }
            System.out.println("Мы в карантине");
        }
    }
}
