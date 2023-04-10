import java.util.Locale;

public class DataOutputInJava {
    public static void main (String[] args){

        System.out.print("Good morning");
        System.out.println("Good morning!");

        int y = 31;
        double x = 10.35784;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US);

        System.out.printf("%.4f%n", x);

        System.out.println("RESULT: " + x + " meters");
        System.out.printf("RESULT = %.2f meters%n", x);

        String name = "Maria";
        int age = 31;
        double income = 4000.0;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.printf("%s is %d years old and earns U$%.2f dollars." , name, age, income);

    }
}
