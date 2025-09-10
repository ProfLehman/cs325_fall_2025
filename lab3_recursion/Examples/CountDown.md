# CountDown

This example demonstrates how recursion can be used to count down from a starting value to zero (or lower). The function repeatedly decrements the input and prints it until the base case is reached. After unwinding, it prints the "end" message for each recursive call.

```java
public class CountDown {
    public static void countDown(int x) {
        if (x > 0) {  // base case is x <= 0
            System.out.println(x);
            countDown(x - 1); // recursive call
        }
        System.out.println("End countDown: " + x);
    }

    public static void main(String[] args) {
        countDown(5);
    }
}
```