# Count Vowels (index approach)

Counts the number of vowels in a string **recursively** by advancing an index `i`. The base case occurs when `i` reaches the string length; otherwise test `s.charAt(i)` and recur with `i + 1`.

```java
public class CountVowelsTwo {
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
    }

    private static int countVowelsTwo(String s, int i) {
        System.out.println(s + ", " + i);
        if (i >= s.length())
            return 0;
        else if (isVowel(s.charAt(i)))
            return 1 + countVowelsTwo(s, i + 1);
        else
            return 0 + countVowelsTwo(s, i + 1);
    }

    public static void main(String[] args) {
        String s = "MississIppi";
        System.out.println("count: " + countVowelsTwo(s, 0));
    }
}
```