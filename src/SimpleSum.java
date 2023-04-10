import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, sum;
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        sum = n1 + n2;

        System.out.printf("SOMA = %d%n", sum);

        sc.close();
    }
}
