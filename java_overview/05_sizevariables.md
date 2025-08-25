# Variable Sizes (Python vs Java)

In C++, you can check the number of bytes used by each data type with `sizeof`.  
Python and Java handle this differently:

- **Python**: types are dynamic, and their memory usage can vary.  
- **Java**: types have fixed, well-defined sizes.  

---

## Python

```python
# sizevariables.py
# j.l. lehman
# fall 2025

import sys

print("variable memory sizes in bytes")
print()

# character (just a 1-length string in Python)
c = 'A'
print("char:", sys.getsizeof(c))
print()

# integers (dynamic size in Python)
i = 0
print("int (0):", sys.getsizeof(i))
j = 12345678901234567890
print("int (big):", sys.getsizeof(j))
print()

# float (always double precision)
f = 0.0
print("float:", sys.getsizeof(f))
print()

# bool
b = True
print("bool:", sys.getsizeof(b))
print()

# pointer concept does not apply directly in Python
print("pointer: managed internally by Python")
````

---

## Java

```java
// SizeVariables.java
// j.l. lehman
// fall 2025

public class SizeVariables {
    public static void main(String[] args) {
        System.out.println("variable memory sizes in bytes\n");

        System.out.println("char: " + Character.BYTES);
        System.out.println();

        System.out.println("short: " + Short.BYTES);
        System.out.println("int: " + Integer.BYTES);
        System.out.println("long: " + Long.BYTES);
        System.out.println();

        System.out.println("float: " + Float.BYTES);
        System.out.println("double: " + Double.BYTES);
        System.out.println();

        System.out.println("boolean: 1 (conceptual, JVM-specific storage)");
        System.out.println();

        System.out.println("pointer: JVM dependent (not directly exposed)");
    }
}
```

---

## Notes & Differences

| Type      | Python                                    | Java (fixed sizes)                    |
| --------- | ----------------------------------------- | ------------------------------------- |
| `int`     | Arbitrary precision, size grows as needed | 32 bits (`Integer.BYTES=4`)           |
| `float`   | 64-bit double precision                   | `float` = 32 bits, `double` = 64 bits |
| `bool`    | Stored as objects (`True`/`False`)        | Conceptually 1 byte, JVM internal     |
| `char`    | Just a string of length 1                 | 16-bit Unicode                        |
| `pointer` | Not exposed (managed by Python runtime)   | Not exposed (JVM-dependent)           |

---

