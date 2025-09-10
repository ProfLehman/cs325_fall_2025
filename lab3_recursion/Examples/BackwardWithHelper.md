# Backward With Helper

This version uses a helper function that tracks the index explicitly. The helper processes one character at a time from the end toward the beginning.

```java
public class BackwardWithHelper {
    public static void backward2(String s) {
        backwardHelper(s, s.length() - 1);
    }

    public static void backwardHelper(String s, int i) {
        if (i >= 0) { // base case
            System.out.print(s.charAt(i));
            backwardHelper(s, i - 1);
        }
    }

    public static void main(String[] args) {
        backward2("Windows 11");
        System.out.println();
        backwardHelper("Huntington", 9);
        System.out.println();
    }
}
```