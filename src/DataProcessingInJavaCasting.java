public class DataProcessingInJavaCasting {
    public static void main(String[] args){

//example-1
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

//example-2
        int i;
        double j;
        i = 5;
        j = 2 * i;

        System.out.println(i);
        System.out.println(j);

//example-3
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B ) / 2.0 * h;

        System.out.println(area);

//example-4
        int m, n;
        double result;
        m = 5;
        n = 2;
        result = (double) m/n;

        System.out.println(result);

//example-5
        double p;
        int q;
        p = 5.0;
        q = (int) p;

        System.out.println(q);

    }
}
