import java.util.Scanner;

public class DataEntryInJavaTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;
        String s1, s2, s3;
        n1 = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Entered values");
        System.out.println(n1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
