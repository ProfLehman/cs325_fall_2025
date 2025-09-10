# Array Total (with helper)

These two functions compute the sum of an integer array recursively. `total` is the simple public API that delegates to the helper `totalH`, which walks the array from index `i` to the end, accumulating via the return value.

```java
public class ArrayTotal {
    public static int total(int data[]) {
        return totalH(data, 0);
    }

    public static int totalH(int data[], int i) {
        if (i < data.length)
            return data[i] + totalH(data, i + 1); // recursive call
        else
            return 0; // base case
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40};
        System.out.println("total: " + total(values));
        System.out.println("totalH: " + totalH(values, 0));
    }
}
```