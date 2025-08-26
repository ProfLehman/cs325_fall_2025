# Rounding Numbers

Programs often need to **round floating-point values** to the nearest integer.  
Different languages handle rounding and truncation in slightly different ways.

---

## Python Example

```python
# round_example.py

a = -2.0
b = a + 0.3
c = a + 0.5
d = a + 0.7

print(f"{a} rounded = {round(a)}")     # -2
print(f"{b} rounded = {round(b)}")     # -2 (rounds to nearest even when exactly .5)
print(f"{c} rounded = {round(c)}")     # -2 (Banker's rounding: -1.5 -> -2)
print(f"{d} rounded = {round(d)}")     # -1

# int() truncates toward zero
print(f"int({d}) = {int(d)}")          # -1
````

---

## Java Example

```java
// RoundExample.java

public class RoundExample {
    public static void main(String[] args) {
        double a = -2.0;
        double b = a + 0.3;
        double c = a + 0.5;
        double d = a + 0.7;

        System.out.println(a + " rounded = " + Math.round(a));
        System.out.println(b + " rounded = " + Math.round(b));
        System.out.println(c + " rounded = " + Math.round(c));
        System.out.println(d + " rounded = " + Math.round(d));

        // Casting to int truncates toward zero
        System.out.println("(int) " + d + " = " + (int)d);
    }
}
```

---

## Notes & Key Differences

* **Python**

  * `round(x)` uses **banker’s rounding** (ties to nearest even number).

    * Example: `round(2.5) == 2`, `round(3.5) == 4`.
  * `int(x)` truncates toward zero.
* **Java**

  * `Math.round(x)` rounds to the nearest integer (half values round away from zero).

    * Example: `Math.round(2.5) == 3`, `Math.round(-2.5) == -2`.
  * Casting `(int)x` truncates toward zero.
* **C++** (original code) often used tricks like `(int)(value + 0.5)` to round positive numbers.
  Negative values require care (`-1.5` may round differently than expected).

---

## Comparison Table: Rounding vs Truncation

| Value | Python `round(x)` | Python `int(x)` | Java `Math.round(x)` | Java `(int)x` |
| ----- | ----------------- | --------------- | -------------------- | ------------- | 
| -2.5  | -2 (to even)      | -2              | -2 (away from 0)     | -2            | 
| -1.5  | -2 (to even)      | -1              | -1 (away from 0)     | -1            | 
| -0.5  | 0 (to even)       | 0               | 0 (away from 0)      | 0             | 
| 0.5   | 0 (to even)       | 0               | 1 (away from 0)      | 0             |
| 1.5   | 2 (to even)       | 1               | 2 (away from 0)      | 1             | 
| 2.5   | 2 (to even)       | 2               | 3 (away from 0)      | 2             | 


---

## Quick Reference

| Language | Round Function        | Truncate Function | Halfway Example         |
| -------- | --------------------- | ----------------- | ----------------------- |
| Python   | `round(2.5) → 2`      | `int(2.5) → 2`    | ties to even (banker’s) |
| Java     | `Math.round(2.5) → 3` | `(int)2.5 → 2`    | ties away from zero     |

---



Would you like me to also update the **C++ section** to explicitly show `std::round` (modern approach) in addition to the older `(int)(x+0.5)` trick?
```
