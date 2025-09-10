# Backward

This function prints a string in reverse order by repeatedly removing the last character and processing the rest. It shows how recursion can operate on substrings.

```java
public class Backward {
    public static void backward(String s) {
        if (s.length() > 0) { // base case
            System.out.print(s.charAt(s.length() - 1));
            backward(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        backward("Huntington University");
        System.out.println();
        backward("Thursday");
        System.out.println();
    }
}
```