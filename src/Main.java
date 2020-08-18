import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välj:\n1 - Veganskt\n2 - Ej veganskt");
        int choiceVeganOrNot = scanner.nextInt();
        System.out.println("Välj:\n1 - Lunch\n2 - Middag\n3 - Dessert");
        int choiceTypeOfSetting = scanner.nextInt();
        String dish = "pizza med svamp och parmesanost";
        String setting = "middag";
        System.out.println("Vi rekommenderar att du äter " + dish + " till " + setting);

        // För att göra mer avancerat: fler val. Nyttigt/snabbt/billigt/allergier osv
    }
}
