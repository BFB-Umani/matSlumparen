import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välj:\n1 - Veganskt\n2 - Ej veganskt");
        int choiceVeganOrNot = scanner.nextInt();
        System.out.println("Välj:\n1 - Lunch\n2 - Middag\n3 - Dessert");
        int choiceTypeOfSetting = scanner.nextInt();

        // För att göra mer avancerat: fler val. Nyttigt/snabbt/billigt osv
    }
}
