# Factorial (int)

This recursive function calculates factorial using an `int`. It multiplies the number by the factorial of one less until the base case of 0 or 1. Since `int` has limited range, results overflow after around 17!

```java
public class FactorialInt {
    public static int fact(int x) {
        if (x == 0 || x == 1)  // base case
            return x;
        else
            return x * fact(x - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        for (int x = 1; x <= 25; x++)
            System.out.println(x + " : " + fact(x));
    }
}
```
