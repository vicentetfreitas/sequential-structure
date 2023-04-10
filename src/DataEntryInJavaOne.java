import java.util.Locale;
import java.util.Scanner;

public class DataEntryInJavaOne {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int number1;
        double number2;
        char character1;

        System.out.println("Example 1: ");
        System.out.println("Enter an string value: ");
        name = sc.next();
        System.out.println("You entered the string: " + name);

        System.out.println("Enter an integer value: ");
        number1 = sc.nextInt();
        System.out.println("The entered integer was: " + number1);

        System.out.println("Enter an double value (.): ");
        number2 = sc.nextDouble();
        System.out.println("The entered double was: " + number2);

        System.out.println("Enter an char value: ");
        character1 = sc.next().charAt(0);
        System.out.println("The entered char was: " + character1);
        System.out.println();

        System.out.println("Example 2: ");
        System.out.println("Enter with string, int, and double values:");
        System.out.println("Example: Name 10 5.5");

        String name1;
        int number3;
        double number4;

        name1 = sc.next();
        number3 = sc.nextInt();
        number4 = sc.nextDouble();
        System.out.println("Entered values: ");
        System.out.println(name1);
        System.out.println(number3);
        System.out.println(number4);

        sc.close();
    }
}
