# CountUp

This example uses recursion to count upward from a start value to a stop value. The recursion stops when the start is greater than the stop. Each call prints its progress as the stack unwinds.

```java
public class CountUp {
    public static void countUp(int start, int stop) {
        if (start <= stop) {  // base case is start > stop
            System.out.println(start);
            countUp(start + 1, stop); // recursive call
        } else {
            System.out.println("done " + start);
        }
        System.out.println("Done start = " + start);
    }

    public static void main(String[] args) {
        countUp(1, 5);
        countUp(5, 20);
    }
}
```