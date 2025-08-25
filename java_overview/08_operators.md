
# Operators (Python vs Java)

Operators perform arithmetic, assignment, and other operations on values.  
Most operators are **similar** across Python and Java, with a few differences.

---

## Python

```python
# operators.py
# j.l. lehman
# fall 2025

# arithmetic
print("3 + 2 =", 3 + 2)
print("3 - 2 =", 3 - 2)
print("3 * 2 =", 3 * 2)
print("3 / 2 =", 3 / 2)    # true division → 1.5
print("3 // 2 =", 3 // 2)  # floor division → 1
print("3 % 2 =", 3 % 2)    # modulus → 1
print()

# order of precedence (PEMDAS)
print("6 + 8 / 2 * 4 - 3 =", 6 + 8 / 2 * 4 - 3)

# assignment
x = 3
print("x =", x)

x = x + 1
print("x =", x)

x += 1
print("x =", x)
print()

# increment/decrement
x += 1   # no ++ in Python
print("x =", x)

x -= 1
print("x =", x)
print()

# post-increment does not exist
y = 4
x = 3
x = x + y
y += 1   # simulate y++
print("x =", x, ", y =", y)
````

---

## Java

```java
// Operators.java
// j.l. lehman
// fall 2025

public class Operators {
    public static void main(String[] args) {

        // arithmetic
        System.out.println("3 + 2 = " + (3 + 2));
        System.out.println("3 - 2 = " + (3 - 2));
        System.out.println("3 * 2 = " + (3 * 2));
        System.out.println("3 / 2 = " + (3 / 2));   // integer division → 1
        System.out.println("3 % 2 = " + (3 % 2));
        System.out.println();

        // precedence
        System.out.println("6 + 8 / 2 * 4 - 3 = " + (6 + 8 / 2 * 4 - 3));

        // assignment
        int x = 3;
        System.out.println("x = " + x);

        x = x + 1;
        System.out.println("x = " + x);

        x += 1;
        System.out.println("x = " + x);
        System.out.println();

        // increment / decrement
        x++;
        System.out.println("x = " + x);

        x--;
        System.out.println("x = " + x);
        System.out.println();

        // post vs pre increment
        x = 3;
        int y = 4;
        x = x + (y++);
        System.out.println("x = " + x + ", y = " + y);

        x = 3;
        y = 4;
        x = x + (++y);
        System.out.println("x = " + x + ", y = " + y);
    }
}
```

---

## Key Differences

| Operator       | Python                                             | Java                                             |
| -------------- | -------------------------------------------------- | ------------------------------------------------ |
| Division       | `/` = float (true division), `//` = floor division | `/` = integer division if both operands are ints |
| Increment      | No `++` or `--`                                    | `++` and `--` (prefix & postfix)                 |
| Assignment ops | `+=, -=, *=, /=`                                   | Same (`+=, -=, *=, /=`)                          |
| Modulus        | `%` works the same                                 | `%` works the same                               |
| Order of ops   | Same precedence rules                              | Same precedence rules                            |

---



Would you like me to also add **comparison and logical operators** (==, !=, <, >, and/or/not) to this page, or keep those separate in a later **“Control Flow”** section?
```
