# Repetition with Loops

> Goal: Learn how to repeat actions using **for**, **while**, and **do-while** loops in Python and Java.

---

## 🔄 Why Loops?

- Loops let you execute code **multiple times** without repeating yourself.
- Three main types:
  - **for** — repeat a known number of times or through a sequence.
  - **while** — repeat as long as a condition is true.
  - **do-while** (Java only) — similar to while, but always runs at least once.

---

## 🐍 Python Loops

### For Loop
```python
# Count 0 to 9
for x in range(10):
    print("for loop x =", x)
````

### While Loop

```python
y = 0
while y < 10:
    print("while loop y =", y)
    y = y + 1
```

### No do-while in Python

Simulate with `while True` and a `break`:

```python
z = 0
while True:
    print("do while loop z =", z)
    z = z + 1
    if z >= 10:
        break
```

---

## ☕ Java Loops

### For Loop

```java
// Count 0 to 9
for (int x = 0; x < 10; x++) {
    System.out.println("for loop x = " + x);
}
```

### While Loop

```java
int y = 0;
while (y < 10) {
    System.out.println("while loop y = " + y);
    y = y + 1;
}
```

### Do-While Loop

```java
int z = 0;
do {
    System.out.println("do while loop z = " + z);
    z = z + 1;
} while (z < 10);
```

---

## ⚠️ Common Pitfalls

* **Infinite Loops**: Forgetting to update the loop variable → program never ends.
* **Off-by-One Errors**: Loop runs one too many or too few times.
* **Range in Python**: `range(10)` goes from 0 up to 9 (not 10).

---



