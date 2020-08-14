package newTheme;

public class BranchingStatements {
    public static void main(String[] args) {
        boolean permissionQuarantineOut = true;
        quarantine(permissionQuarantineOut);
    }

    private static void quarantine(boolean permission) {
        {

        }
        // создание метки

        quarantineZone:
        {
            if (permission) {
                System.out.println("Выходим из карантина");
                break quarantineZone;
            }
            System.out.println("Мы в карантине");
        }
    }
}

