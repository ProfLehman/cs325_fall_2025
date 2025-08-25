
# Strings (Python vs Java)

Strings are sequences of characters.  
Both **Python** and **Java** treat strings as objects with built-in methods.

---

## Python

```python
# strings.py
# j.l. lehman
# fall 2025

s = "Foresters"

# length
print("length:", len(s))

# indexing (0-based)
print("s[2] =", s[2])

# substring (slice)
t = s[2:6]
print("substring s[2:6] =", t)

# concatenation
s2 = s + " are strong"
print(s2)

# find
print("index of 'res':", s.find("res"))

# replace
print(s.replace("Fore", "Hunters"))

# split
words = "Huntington University".split()
print("split into words:", words)

# join
joined = "-".join(words)
print("joined:", joined)

# case changes
print(s.lower(), s.upper())
````

---

## Java

```java
// Strings.java
// j.l. lehman
// fall 2025

public class Strings {
    public static void main(String[] args) {
        String s = "Foresters";

        // length
        System.out.println("length: " + s.length());

        // indexing (0-based, use charAt)
        System.out.println("s[2] = " + s.charAt(2));

        // substring
        String t = s.substring(2, 6); // end index exclusive
        System.out.println("substring s[2:6] = " + t);

        // concatenation
        String s2 = s + " are strong";
        System.out.println(s2);

        // find (indexOf)
        System.out.println("index of 'res': " + s.indexOf("res"));

        // replace
        System.out.println(s.replace("Fore", "Hunters"));

        // split
        String phrase = "Huntington University";
        String[] words = phrase.split(" ");
        System.out.println("split into words:");
        for (String w : words) {
            System.out.println("  " + w);
        }

        // join (Java 8+)
        String joined = String.join("-", words);
        System.out.println("joined: " + joined);

        // case changes
        System.out.println(s.toLowerCase() + " " + s.toUpperCase());
    }
}
```

---

## Notes & Differences

| Operation     | Python                             | Java                                 |
| ------------- | ---------------------------------- | ------------------------------------ |
| Length        | `len(s)`                           | `s.length()`                         |
| Indexing      | `s[2]`                             | `s.charAt(2)`                        |
| Substring     | `s[2:6]` (end inclusive-exclusive) | `s.substring(2, 6)` (end exclusive)  |
| Concatenation | `s + "text"`                       | `s + "text"`                         |
| Find          | `s.find("res")`                    | `s.indexOf("res")`                   |
| Replace       | `s.replace("old", "new")`          | `s.replace("old", "new")`            |
| Split         | `"a b".split()` → list             | `"a b".split(" ")` → array           |
| Join          | `"-".join(list)`                   | `String.join("-", array)`            |
| Case change   | `s.lower()`, `s.upper()`           | `s.toLowerCase()`, `s.toUpperCase()` |

---

