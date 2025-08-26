# Rounding Numbers

Programs often need to **round floating-point values** to the nearest integer.  
Different languages handle rounding and truncation in slightly different ways.

---

## Python Example

```python
# Python rounds to the nearest even number
# -1.5 rounds to -2
# -2.5 rounds to -2

a = 0.0
count = 0
while count <= 10:
    
    print(f"{a+.1:.1f} rounded = {round(a+.1)}")   #-n.4
    print(f"{a:.1f} rounded = {round(a)}")         #-n.5
    print(f"{a-.1:.1f} rounded = {round(a-.1)}")   #-n.6
    
    a = a - .5
    count = count + 1
````

---

## Java Example

```java
// RoundExample.java

public class RoundExample {
    public static void main(String[] args) {

        // Java rounds to next largest number at .5
        // -1.5 rounds to -1
        // -2.5 rounds to -2
        double a = 0.0;
        int count = 0;

        while (count <= 10) {

            System.out.printf("%.1f rounded = %d%n", a + .1, Math.round(a + .1)); // -n.4
            System.out.printf("%.1f rounded = %d%n", a, Math.round(a)); // -n.5
            System.out.printf("%.1f rounded = %d%n", a - .1, Math.round(a - .1)); // -n.6
            a = a - 0.5;
            count = count + 1;
        }

    }
}
```

| N | Python | Java |
|----------|:--------:|---------:|
|0.1 rounded =| 0|0  |
|0.0 rounded = |0|0  |
|-0.1 rounded = |0| 0 |
|-0.4 rounded =| 0| 0 |
|-0.5 rounded = |0| 0 |
|-0.6 rounded = |-1| -1|
|-0.9 rounded =| -1| -1|
|-1.0 rounded = |-1| -1|
|-1.1 rounded = |-1| -1|
|-1.4 rounded =| -1| -1|
|-**1.5** rounded = |**-2**|**-1**|
|-1.6 rounded = |-2| -2|
|-1.9 rounded =| -2| -2|
|-2.0 rounded = |-2| -2|
|-2.1 rounded = |-2| -2|
|-2.4 rounded =| -2| -2|
|-2.5 rounded = |-2| -2|
|-2.6 rounded = |-3| -3|
|-2.9 rounded =| -3| -3|
|-3.0 rounded = |-3| -3|
|-3.1 rounded = |-3| -3|
|-3.4 rounded =| -3| -3|
|**-3.5** rounded = |**-4**| **-3**|
|-3.6 rounded = |-4| -4|
|-3.9 rounded =| -4| -4|
|-4.0 rounded = |-4| -4|
|-4.1 rounded = |-4| -4|
|-4.4 rounded =| -4| -4|
|-4.5 rounded = |-4| -4|
|-4.6 rounded = |-5| -5|
|-4.9 rounded =| -5| -5|
|-5.0 rounded = |-5| -5|
|-5.1 rounded = |-5| -5|
---

## Notes & Key Differences

* **Python**

  * `round(x)` uses **banker’s rounding** (ties to nearest even number).

    * Example: `round(2.5) == 2`, `round(3.5) == 4`.
  * `int(x)` truncates toward zero.
* **Java**

  * `Math.round(x)` rounds to the nearest integer (half values round away from zero).

    * Example: `Math.round(2.5) == 3`, `Math.round(-2.5) == -2`.
---

