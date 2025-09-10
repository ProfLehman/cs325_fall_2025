# CountIf

This recursive function counts the number of times a given character occurs in a string. It checks one index at a time, moving forward until the end of the string.

```java
public class CountIf {
    public static int countIf(String s, String v, int i) {
        if (i >= s.length()) // base case
            return 0;
        else if (s.substring(i, i + 1).equals(v))
            return 1 + countIf(s, v, i + 1);
        else
            return 0 + countIf(s, v, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(countIf("Mississippi", "i", 0));
    }
}
```