# NeverEnd

This example illustrates infinite recursion: the function keeps calling itself without a base case. Running it will eventually cause a stack overflow error. The main call is commented out to prevent crashing.

```java
public class NeverEnd {
    public static void neverEnd(int x) {
        System.out.println(x);
        neverEnd(x + 1); // no base case!
    }

    public static void main(String[] args) {
        // neverEnd(0); // Uncomment to see infinite recursion
    }
}
```