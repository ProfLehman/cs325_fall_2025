# Count Greater Than N (with helper)

These two functions count how many elements in an integer array are **greater than** a target `n`. The public `greater` sets up the initial indices and calls `greaterH`, which advances from `i` to `.length` and counts matches recursively.

```java
public class ArrayGreaterThan {

    public static int greater(int data[], int n) {

        return greaterH(data, n, 0 );

    }

    public static int greaterH(int temp[], int n, int i) {

        if (i >= temp.length) // base case
            return 0;
        else {
            if (temp[i] > n)
                return 1 + greaterH(temp, n, i + 1); // recursive call
            else
                return 0 + greaterH(temp, n, i + 1); // recursive call
        }

    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40};

        System.out.println("greater (>25): " + greater(values, 25));

        System.out.println("greaterH (>25): " + greaterH(values, 25, 0));
    }

}
```
