public class MathFunctionsInJava {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        System.out.println();

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Square root of " + x + " = " + A);
        System.out.println("Square root of " + x + " = " + B);
        System.out.println("Square root of 25 = " + C);
        System.out.println();

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " raised to " + y + " = " + A);
        System.out.println(x + " squared = " + B);
        System.out.println("5 squared = "  + C);
        System.out.println();

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Absolute value of " + y + " = " + A);
        System.out.println("Absolute value of " + z + " = " + B);
    }
}
