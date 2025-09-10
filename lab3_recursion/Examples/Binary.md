# Binary

This example uses recursion to convert an integer into binary. The function divides the number by 2 until reaching 0 or 1, then prints the remainder during the stack unwinding.

```java
public class Binary {
    public static void binary(int x) {
        if (x == 0 || x == 1) { // base case
            System.out.print(x);
        } else {
            binary(x / 2); // recursive call
            System.out.print(x % 2);
        }
    }

    public static void main(String[] args) {
        binary(19);
        System.out.println();
    }
}
```