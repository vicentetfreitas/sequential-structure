import java.util.Scanner;

public class CalculateDifferenceBetweenProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C,D, difference;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        difference = (A * B - C * D);

        System.out.printf("DIFERENCA = %d%n", difference);

        sc.close();
    }
}
