# Count Vowels (substring approach)

Counts the number of vowels in a string **recursively** by consuming the first character on each call. The base case is the empty string; otherwise, test the first character and recur on `s.substring(1)`.

```java
public class CountVowelsOne {
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
    }

    private static int countVowelsOne(String s) {
        System.out.println(s);
        if (s.length() == 0)
            return 0;
        else if (isVowel(s.charAt(0)))
            return 1 + countVowelsOne(s.substring(1));
        else
            return 0 + countVowelsOne(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "MississIppi";
        System.out.println("count: " + countVowelsOne(s));
    }
}
```