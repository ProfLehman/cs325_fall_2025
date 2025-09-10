# BaseN

This example generalizes the binary conversion to any base `b`. The number is divided by the base recursively until the result is less than the base, then remainders are printed.

```java
public class BaseN {
    public static void base(int x, int b) {
        if (x < b) { // base case
            System.out.print(x + " ");
        } else {
            base(x / b, b);
            System.out.print(x % b + " ");
        }
    }

    public static void main(String[] args) {
        base(10, 4);
        System.out.println();
    }
}
```