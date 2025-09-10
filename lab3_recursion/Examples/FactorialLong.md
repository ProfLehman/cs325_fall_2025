# Factorial (long)

This recursive function calculates factorial using a `long`, which allows for larger results than `int`. Still, it eventually overflows as numbers grow quickly.

```java
public class FactorialLong {
    public static long fact2(long x) {
        if (x == 0 || x == 1)  // base case
            return x;
        else
            return x * fact2(x - 1);
    }

    public static void main(String[] args) {
        for (int x = 1; x <= 25; x++)
            System.out.println(x + " : " + fact2(x));
    }
}
```