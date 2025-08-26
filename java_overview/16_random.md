# Random Numbers

---

## 🎲 Why Random?

- Random numbers are used in:
  - Dice rolls, coin flips, games
  - Simulations and probability
  - Shuffling and sampling
- Computers don’t make “true” random numbers, but **pseudo-random numbers** using an algorithm and a **seed**.

---

## 🐍 Python Random

### Import the Module
```python
import random
````

### Examples

```python
print(random.random())      # random float [0.0, 1.0)
print(random.randint(1, 6)) # random int between 1 and 6 inclusive
print(random.uniform(1, 10))# random float between 1 and 10

colors = ["red", "green", "blue"]
print(random.choice(colors)) # random element
```

### Setting the Seed

```python
random.seed(42)   # reproducible sequence
print(random.randint(1, 6))
```

---

## ☕ Java Random

### Import the Class

```java
import java.util.Random;
```

### Examples

```java
Random rand = new Random();

System.out.println(rand.nextInt(6) + 1);   // random int 1–6
System.out.println(rand.nextDouble());     // random double [0.0, 1.0)
System.out.println(rand.nextInt(100));     // random int 0–99
```

### Setting the Seed

```java
Random rand = new Random(42);  // reproducible sequence
System.out.println(rand.nextInt(6) + 1);
```

---

## 🎯 Comparing

| Task                    | Python                 | Java                                   |
| ----------------------- | ---------------------- | -------------------------------------- |
| Random 0–1 float        | `random.random()`      | `rand.nextDouble()`                    |
| Random integer 1–6      | `random.randint(1, 6)` | `rand.nextInt(6) + 1`                  |
| Random float range      | `random.uniform(a, b)` | `a + rand.nextDouble() * (b - a)`      |
| Random choice from list | `random.choice(list)`  | use list + `rand.nextInt(list.size())` |

---

## ⚠️ Common Pitfalls

* **Python**: `randint(a, b)` includes both endpoints.
* **Java**: `nextInt(n)` generates `0 … n-1`, so add `+1` if you want 1-based results.
* Seeding the generator produces the **same sequence** every time (useful for debugging).

---

