# Array Average (with helper)

This pair computes the average of an integer array **recursively** by threading a running sum through the call stack. The public `average` delegates to `averageH`, which returns the final `sum / length` at the base case.

```java
public class ArrayAverage {
    private static double average(int[] values) {
        return averageH(values, 0, 0);
    }

    public static double averageH(int temp[], int i, double sum) {
        if (i >= temp.length) // base case
            return sum / temp.length;
        else
            return averageH(temp, i + 1, sum + temp[i]); // recursive call
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40};
        System.out.println("average: " + average(values));
        System.out.println("averageH: " + averageH(values, 0, 0));
    }
}
```