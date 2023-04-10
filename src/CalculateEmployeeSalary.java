import java.util.Locale;
import java.util.Scanner;

public class CalculateEmployeeSalary {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberEmployee, workedHours;
        double valueOfTheHourWorked, salary;

        numberEmployee = sc.nextInt();
        workedHours = sc.nextInt();
        valueOfTheHourWorked = sc.nextDouble();
        salary = workedHours * valueOfTheHourWorked;

        System.out.println("NUMBER = " + numberEmployee);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
