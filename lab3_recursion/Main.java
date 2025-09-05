// lab3a.java
// lehman
// fall 2025
// power and GCD recursive functions
//
public class Main {
    public static void main(String[] args) {

        System.out.println(power(2, 3));
        System.out.println();

        System.out.println(power(10, 2));
        System.out.println();

        System.out.println(gcd(10, 45));
        System.out.println();

        System.out.println(gcd(3, 9));
        System.out.println();

    }

    public static int power(int x, int y) {
        System.out.println("power(" + x + "," + y + ")");
        if (y == 0)
            return 1;
        else if (y == 1)
            return x;
        else
            return x * power(x, y - 1);
    }

    public static int gcd(int x, int y) {
        System.out.println("gcd(" + x + "," + y + ")");
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

}