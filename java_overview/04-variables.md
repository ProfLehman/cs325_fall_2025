
# Variables (Python vs Java)

Covers: integers, booleans, characters, floating‑point (`float`/`double`), strings, and constants.

---

## Python

```python
# variables.py
# j.l. lehman
# fall 2025

# int
i1 = 7
i2 = 8
print("int i1 =", i1, ", i2 =", i2)
print()

# bool
b1 = True
b2 = False
print("bool b1 =", b1, ", b2 =", b2)
print()

# "char" (Python uses 1‑length strings)
c1 = 'H'
c2 = 'U'
print("char c1 =", c1, ", c2 =", c2)
print()

# float (Python floats are double‑precision)
f1 = 3.14
f2 = 98.6
print("float f1 =", f1, ", f2 =", f2)
print()

# string
s1 = "Huntington"
s2 = "University"
s3 = s1 + " " + s2
print("string s1 =", s1, ", s2 =", s2)
print("string s3 =", s3)
print()

# constant (convention: ALL_CAPS; not enforced)
PI = 3.14157
print(PI)
````

---

## Java

```java
// Variables.java
// j.l. lehman
// fall 2025

public class Variables {
    public static void main(String[] args) {

        // int
        int i1 = 7;
        int i2 = 8;
        System.out.println("int i1 = " + i1 + ", i2 = " + i2);
        System.out.println();

        // boolean
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("bool b1 = " + b1 + ", b2 = " + b2);
        System.out.println();

        // char
        char c1 = 'H';
        char c2 = 'U';
        System.out.println("char c1 = " + c1 + ", c2 = " + c2);
        System.out.println();

        // float (note the 'f' suffix)
        float f1 = 3.14f;
        float f2 = 98.6f;
        System.out.println("float f1 = " + f1 + ", f2 = " + f2);
        System.out.println();

        // double
        double d1 = 3.14;
        double d2 = 98.6;
        System.out.println("double d1 = " + d1 + ", d2 = " + d2);
        System.out.println();

        // string
        String s1 = "Huntington";
        String s2 = "University";
        String s3 = s1 + " " + s2;
        System.out.println("string s1 = " + s1 + ", s2 = " + s2);
        System.out.println("string s3 = " + s3);
        System.out.println();

        // constant (use 'final')
        final double PI = 3.14157;
        System.out.println(PI);
    }
}
```

---

## Notes & Differences

| Topic        | Python                                 | Java                                                             |
| ------------ | -------------------------------------- | ---------------------------------------------------------------- |
| Types        | Inferred at runtime                    | Declared (`int`, `boolean`, `char`, `float`, `double`, `String`) |
| Boolean      | `True` / `False`                       | `true` / `false`                                                 |
| Char         | 1‑length string                        | Dedicated `char` type (single quotes)                            |
| Float/Double | `float` is double‑precision by default | `float` needs `f` suffix; `double` is default                    |
| Strings      | Concatenate with `+`                   | Concatenate with `+`                                             |
| Constants    | Convention (ALL\_CAPS) only            | `final` keyword enforces immutability                            |

---
