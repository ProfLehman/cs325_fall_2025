# Casting in Python and Java

Casting converts a value from one data type to another.

- **Implicit casting (promotion):** The language does it automatically when it’s safe (e.g., `int → double` in Java).
- **Explicit casting:** You, the programmer, request a conversion (e.g., `double → int`), which may **truncate** or **lose precision**.

---

## Python Example

```python
# casting.py

# integer vs floating-point division
print("int/int 10//3 =", 10 // 3)       # floor division (integer result)
print("float/float 10.0/3.0 =", 10.0 / 3.0)
print("int/float 10/3.0 =", 10 / 3.0)
print("float/int 10.0/3 =", 10.0 / 3)
print()

# explicit casting
print("float(10//3) =", float(10 // 3))
print("float(10)/3 =", float(10) / 3)
print("int(10.0/3.0) =", int(10.0 / 3.0))  # truncates toward zero
print()

# character and code points
print("chr(65) =", chr(65))
print("ord('A') =", ord('A'))
print("ord('a') =", ord('a'))

c = 'W'
print("chr(ord(c)+32) =", chr(ord(c) + 32))  # simple case-shift: 'W' -> 'w'
````

---

## Java Example

```java
// Casting.java

public class Casting {
    public static void main(String[] args) {

        // integer vs floating-point division
        System.out.println("int/int 10/3 = " + (10 / 3));          // integer division (truncates)
        System.out.println("double/double 10.0/3.0 = " + (10.0 / 3.0));
        System.out.println("int/double 10/3.0 = " + (10 / 3.0));
        System.out.println("double/int 10.0/3 = " + (10.0 / 3));
        System.out.println();

        // explicit casts
        System.out.println("(double)(10/3) = " + (double)(10 / 3));   // cast AFTER int division
        System.out.println("(double)10 / 3 = " + ((double)10 / 3));   // cast BEFORE division
        System.out.println("(int)(10.0/3.0) = " + (int)(10.0 / 3.0)); // truncates toward zero
        System.out.println();

        // characters and ASCII/Unicode code points
        System.out.println("(char)65 = " + (char)65);
        System.out.println("(int)'A' = " + (int)'A');
        System.out.println("(int)'a' = " + (int)'a');

        char c = 'W';
        System.out.println("(char)(c + 32) = " + (char)(c + 32));     // 'W' -> 'w' (ASCII dependent)
    }
}
```

---

## Notes & Key Differences

### Division and Truncation

* **Python**

  * `/` always produces a floating-point result.
  * `//` is floor division (e.g., `10 // 3 == 3`).
  * `int(x)` **truncates toward zero** (e.g., `int(-2.7) == -2`). Use `round(x)` for rounding.
* **Java**

  * `/` between two `int` values performs **integer division** (truncation).
  * If either operand is `double`/`float`, Java promotes and does floating-point division.
  * Casting `((int) value)` **truncates toward zero**. Use `Math.round`, `Math.floor`, or `Math.ceil` for rounding.

### Implicit vs Explicit Casting

* **Python**

  * Dynamically typed; types are attached to values, not variables.
  * No implicit narrowing/ widening rules like Java; you typically **call constructors/functions** for conversions (e.g., `float(10)`, `int(3.9)`).
* **Java**

  * **Widening (safe) implicit casts** happen automatically, e.g., `int → long → float → double`.
  * **Narrowing (potentially lossy) casts** require an explicit cast, e.g., `double → int`, `long → int`.
  * Be careful: narrowing can **overflow** or **lose fractional parts**.

### Characters and Code Points

* **Python**

  * `ord('A')` → `65`, `chr(65)` → `'A'`. Uses full Unicode.
  * Case-shifting via adding 32 only “works” for ASCII letters; prefer `.lower()` / `.upper()`.
* **Java**

  * `char` is a 16-bit UTF-16 code unit. `(int)'A'` → `65`, `(char)65` → `'A'`.
  * Adding 32 to switch case relies on ASCII; prefer `Character.toLowerCase(c)` / `Character.toUpperCase(c)` for correctness.

### Common Gotchas

* `(double)(10/3)` in Java first does **int division** (`10/3 == 3`) and **then** casts to `3.0`.

  * To get the precise fraction, cast **before** dividing: `((double)10) / 3`.
* In Python, `int(10.9)` yields `10` (truncation). If you want rounding, use `round(10.9)` (which returns `11`).

---

## Quick Reference

| Task                   | Python                | Java                         |
| ---------------------- | --------------------- | ---------------------------- |
| Integer division       | `10 // 3  # → 3`      | `10 / 3  // → 3`             |
| Floating division      | `10 / 3  # → 3.333…`  | `10 / 3.0  // → 3.333…`      |
| Cast to float/double   | `float(10)`           | `(double) 10`                |
| Cast to int (truncate) | `int(3.9)  # → 3`     | `(int) 3.9  // → 3`          |
| Char/code conversions  | `chr(65)`, `ord('A')` | `(char)65`, `(int)'A'`       |
| Lower/upper safely     | `'W'.lower()`         | `Character.toLowerCase('W')` |

---

