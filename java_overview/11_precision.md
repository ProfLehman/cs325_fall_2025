# Numeric Precision & Formatting (Python ↔ Java)
---

## 🔎 What “precision” means

- **Value precision**: how many digits a number can represent **internally** (e.g., `double` ≈ 15–17 decimal digits).
- **Display precision (formatting)**: how many digits you **show** when printing (e.g., “2 decimal places”).
- **Binary floating-point** (`float`/`double`) cannot exactly represent most decimals (like `0.1`). Use **Decimal** (Python) / **BigDecimal** (Java) when exact base-10 arithmetic matters (money, grading rules, etc.).

### Quick reference

| Language | Type              | Typical precision | Notes |
|---|---|---:|---|
| Python   | `float`          | ~15–17 digits     | IEEE-754 double under the hood |
| Python   | `Decimal`        | Arbitrary         | Exact base-10; configurable context/rounding |
| Java     | `float`          | ~7 digits         | 32-bit IEEE-754 |
| Java     | `double`         | ~15–17 digits     | 64-bit IEEE-754 |
| Java     | `BigDecimal`     | Arbitrary         | Exact base-10; specify `MathContext`/`setScale` |

---

## 🖨️ Formatting vs. value: the essentials

### Python formatting
- Fixed decimals: `f"{x:.2f}"`  → two places
- Scientific: `f"{x:.3e}"`      → scientific with 3 decimals
- Significant digits: `format(x, ".6g")`
- Note: formatting **does not change** the stored value—just how it prints.

### Java formatting
- Fixed decimals: `System.out.printf("%.2f%n", x);`
- Scientific: `System.out.printf("%.3e%n", x);`
- `DecimalFormat` for locale/patterns: `new DecimalFormat("0.00")`
- Like Python, formatting doesn’t change the stored value.

---

## 🧪 Floating-point surprise: 0.1 + … + 0.1

> The classic “why is 0.1 not exact?” demo. You’ll see tiny binary errors.

### Python
```python
# demo_precision.py
x = 0.0
for _ in range(10):
    x += 0.1
print("Raw:", x)                       # 0.9999999999999999 (often)
print("Shown (2 dp):", f"{x:.2f}")     # 1.00
print("Shown (17 sig):", format(x, ".17g"))
````

### Java

```java
// DemoPrecision.java
public class DemoPrecision {
    public static void main(String[] args) {
        double x = 0.0;
        for (int i = 0; i < 10; i++) x += 0.1;
        System.out.println("Raw: " + x);                    // 0.9999999999999999 (often)
        System.out.printf("Shown (2 dp): %.2f%n", x);       // 1.00
        System.out.printf("Shown (17 sig): %.17g%n", x);
    }
}
```

---

## 🎯 Formatting to N decimal places

### Python

```python
pi = 3.141592653589793
print(f"{pi:.2f}")         # 3.14
print(f"{pi:.6f}")         # 3.141593
print(f"{pi:.3e}")         # 3.142e+00
print(format(pi, ".10g"))  # 3.141592654  (10 significant digits)
```

### Java

```java
double pi = Math.PI;
System.out.printf("%.2f%n", pi);   // 3.14
System.out.printf("%.6f%n", pi);   // 3.141593
System.out.printf("%.3e%n", pi);   // 3.142e+00

import java.text.DecimalFormat;
DecimalFormat df = new DecimalFormat("0.##########"); // up to 10 decimals
System.out.println(df.format(pi));  // 3.1415926536
```

---

## 💵 Exact decimals: money & grading

Binary floating-point + rounding rules can bite you. Prefer **Decimal/BigDecimal**.

### Python — `decimal.Decimal`

```python
from decimal import Decimal, getcontext, ROUND_HALF_EVEN

getcontext().prec = 28                   # significant digits
getcontext().rounding = ROUND_HALF_EVEN  # "bankers' rounding"

price  = Decimal("19.99")
qty    = Decimal("3")
total  = price * qty                     # exact 59.97
tax    = (total * Decimal("0.07")).quantize(Decimal("0.01"))
grand  = (total + tax).quantize(Decimal("0.01"))
print(total, tax, grand)                 # 59.97 4.20 64.17
```

### Java — `BigDecimal`

```java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;

MathContext MC = new MathContext(28, RoundingMode.HALF_EVEN);

BigDecimal price = new BigDecimal("19.99");    // use String ctor!
BigDecimal qty   = new BigDecimal("3");
BigDecimal total = price.multiply(qty, MC);    // 59.97

BigDecimal tax   = total.multiply(new BigDecimal("0.07"), MC)
                        .setScale(2, RoundingMode.HALF_EVEN);
BigDecimal grand = total.add(tax).setScale(2, RoundingMode.HALF_EVEN);

System.out.println(total + " " + tax + " " + grand); // 59.97 4.20 64.17
```

> ✅ **Tips**
>
> * Always construct `BigDecimal` from **strings**, not `double`.
> * In Python, always pass **strings** to `Decimal` (not `float`), and quantize to your currency scale.

---

## 🔧 Rounding behaviors you’ll observe

* **Python `round()`**: ties-to-even (bankers’ rounding). Example: `round(2.5) == 2`, `round(3.5) == 4`.
* **Python formatting** (`f"{x:.2f}"`, `format(x, ".2f")`): also ties-to-even.
* **Java `printf`/`Formatter`**: rounds for display; for **business rules** use `BigDecimal.setScale(…, RoundingMode.…)`.
* **Never rely on `float`/`double` for exact cents**.

---

## 🧭 Common patterns (cheat-sheet)

| Task                     | Python                                   | Java                                              |
| ------------------------ | ---------------------------------------- | ------------------------------------------------- |
| Show 2 decimals          | `f"{x:.2f}"`                             | `System.out.printf("%.2f%n", x);`                 |
| Scientific w/ 3 decimals | `f"{x:.3e}"`                             | `System.out.printf("%.3e%n", x);`                 |
| Up to N decimals         | `format(x, ".10g")` (sig figs)           | `new DecimalFormat("0.##########").format(x)`     |
| Exact cents (money)      | `Decimal("…").quantize(Decimal("0.01"))` | `new BigDecimal("…").setScale(2, RoundingMode.…)` |
| Sum 0.1 exactly          | use `Decimal("0.1")`                     | use `new BigDecimal("0.1")`                       |

---


