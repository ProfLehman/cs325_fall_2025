# Min/Max Values (Python vs Java)

In C++ you can query min/max with headers like `<climits>`/`<cfloat>`.  
Here’s how the idea maps to **Python** and **Java**.

- **Python**: `int` has **no fixed limit** (arbitrary precision). `float` is IEEE‑754 double; use `sys.float_info`.
- **Java**: primitives have **fixed ranges** and constants like `Integer.MIN_VALUE`.

---

## Python

```python
# minmax.py
# j.l. lehman
# fall 2025

import sys

print("*** Python numeric ranges ***\n")

# Integers are arbitrary precision in Python
print("int: no fixed min/max (grows as needed)")

# Float is IEEE-754 double precision
print(f"float (double) - smallest positive normalized: {sys.float_info.min}")
print(f"float (double) - largest finite:              {sys.float_info.max}")
print()

# Booleans are just True/False (no numeric range concept)
print("bool: values are True or False\n")

# 'char' concept: Python uses Unicode strings
# Valid Unicode code points range from U+0000 to U+10FFFF
print("char (1-length string): code point range U+0000 to U+10FFFF")
````

> Notes
>
> * `sys.float_info.min` is the **smallest positive normalized** float (\~2.225e‑308).
> * For “signed range” intuition, think \~`-sys.float_info.max` to `+sys.float_info.max`.

---

## Java

```java
// MinMax.java
// j.l. lehman
// fall 2025

public class MinMax {
    public static void main(String[] args) {
        System.out.println("*** Java primitive ranges ***\n");

        // Signed integer types
        System.out.println("byte:   " + Byte.MIN_VALUE   + " to " + Byte.MAX_VALUE);
        System.out.println("short:  " + Short.MIN_VALUE  + " to " + Short.MAX_VALUE);
        System.out.println("int:    " + Integer.MIN_VALUE+ " to " + Integer.MAX_VALUE);
        System.out.println("long:   " + Long.MIN_VALUE   + " to " + Long.MAX_VALUE);
        System.out.println();

        // Character (unsigned 16-bit Unicode code unit)
        System.out.println("char (code unit): " 
            + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE + " (0 to 65535)");
        System.out.println();

        // Floating point
        System.out.println("float  smallest positive (Float.MIN_VALUE): " + Float.MIN_VALUE);
        System.out.println("float  largest finite  (Float.MAX_VALUE):  " + Float.MAX_VALUE);
        System.out.println("float  practical signed range:            " 
            + (-Float.MAX_VALUE) + " to " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("double smallest positive (Double.MIN_VALUE): " + Double.MIN_VALUE);
        System.out.println("double largest finite  (Double.MAX_VALUE):  " + Double.MAX_VALUE);
        System.out.println("double practical signed range:             " 
            + (-Double.MAX_VALUE) + " to " + Double.MAX_VALUE);
        System.out.println();

        // Booleans
        System.out.println("boolean: values are true or false");
    }
}
```

> ⚠️ **Important Java gotcha**
> `Float.MIN_VALUE` / `Double.MIN_VALUE` are **not** the most negative numbers.
> They are the **smallest positive nonzero** values.
> For a signed “range” intuition, use `-Float.MAX_VALUE … Float.MAX_VALUE` (and same for double).

---

## Summary

| Type     | Python                                        | Java (fixed)                                                          |
| -------- | --------------------------------------------- | --------------------------------------------------------------------- |
| `int`    | No fixed min/max (arbitrary precision)        | `-2^31 … 2^31-1` (`int`), `-2^63 … 2^63-1` (`long`)                   |
| `float`  | IEEE‑754 double; min/max via `sys.float_info` | `float`: smallest +ve `Float.MIN_VALUE`, largest `Float.MAX_VALUE`    |
| `double` | (same as above; Python `float` == double)     | `double`: smallest +ve `Double.MIN_VALUE`, largest `Double.MAX_VALUE` |
| `bool`   | `True` / `False`                              | `true` / `false`                                                      |
| `char`   | 1‑length Unicode string; U+0000..U+10FFFF     | 16‑bit code unit; 0..65535 (`char`)                                   |

---


```
```
