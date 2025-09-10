# Backward Return

Instead of printing characters, this function *returns* the reversed string. It demonstrates recursion where values are combined during the unwinding phase.

```java
public class BackwardReturn {
    public static String backward3(String s) {
        if (s.length() > 0) {
            return s.substring(s.length() - 1) + backward3(s.substring(0, s.length() - 1));
        } else {
            return ""; // base case
        }
    }

    public static void main(String[] args) {
        System.out.println(backward3("Friday"));
    }
}
```