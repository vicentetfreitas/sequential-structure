import java.util.Locale;
import java.util.Scanner;

public class CalculateTotalPartsPay {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        int part1, part2;
        double valuePart1, valuePart2, valuePartTotal;

        sc.nextInt();
        part1 = sc.nextInt();
        valuePart1 = sc.nextDouble();
        sc.nextLine();
        sc.nextInt();
        part2 = sc.nextInt();
        valuePart2 = sc.nextDouble();

        valuePartTotal = (part1 * valuePart1) + (part2 * valuePart2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valuePartTotal);

        sc.close();
    }
}
